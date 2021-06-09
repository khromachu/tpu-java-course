package lab4;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Pattern number = Pattern.compile("\\d+");
    static Pattern operator = Pattern.compile("[+\\-*/]");

    static float CalculateString (String operation){
        Matcher numbers = number.matcher(operation);
        Matcher op = operator.matcher(operation);
        numbers.find();
        float a = new Float(numbers.group());
        numbers.find();
        float b = new Float(numbers.group());
        op.find();
        switch (op.group()){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            case "*":
                return a * b;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        try {
            File file = new File("src/lab4/operations.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line + " = " + CalculateString(line));
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
