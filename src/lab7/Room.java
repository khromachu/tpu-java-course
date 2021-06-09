package lab7;

public class Room {
    public RoomTypes type;
    public Integer area;

    public Room(RoomTypes type, Integer area){
        this.type = type;
        this.area = area;
    }

    public String getInfo(){
        return "Комната: " + type.toString() + ", площадь: " + area;
    }
}
