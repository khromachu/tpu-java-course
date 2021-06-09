package lab7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class Main {

    private static <T> Iterator<T> getIterator(final T[] array) {
        return new Iterator<T>() {
            private int count = array.length;
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public T next() {
                if (index < count) {
                    return array[index++];
                } else {
                    throw new NoSuchElementException("No such element.");
                }
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove item from array.");
            }
        };
    }

    static RoomTypes RandomRoomType(){
        switch ((int)Math.floor(Math.random()*5)){
            case 0:
                return RoomTypes.TOILET;
            case 1:
                return RoomTypes.GUEST_ROOM;
            case 2:
                return RoomTypes.KITCHEN;
            default:
                return RoomTypes.BED_ROOM;
        }
    }

    static Integer RandomArea(){
        return (int)(Math.random()*30) + 10;
    }

    public static void main(String[] args) {
        ArrayList<Iterator> house = new ArrayList<>();
        Integer floors = 5;
        Integer roomsOnFloor = 4;
        for (int i = 0; i < floors; i++) {
            System.out.println("======== Этаж "+ i + " ========");
            switch (i){
                case 0:
                    Room[] floor = new Room[roomsOnFloor];
                    for (int j = 0; j < roomsOnFloor; j++) {
                        floor[j] = new Room(RandomRoomType(), RandomArea());
                        System.out.println(floor[j].getInfo());
                    }
                    house.add(getIterator(floor));
                    break;
                case 1:
                    ArrayList<Room> floor1 = new ArrayList<Room>();
                    for (int j = 0; j < roomsOnFloor; j++) {
                        floor1.add(new Room(RandomRoomType(), RandomArea()));
                        System.out.println(floor1.get(j).getInfo());
                    }
                    house.add(floor1.iterator());
                    break;
                default:
                    if (Math.random() > 0.5){
                        Room[] floor2 = new Room[roomsOnFloor];
                        for (int j = 0; j < roomsOnFloor; j++) {
                            floor2[j] = new Room(RandomRoomType(), RandomArea());
                            System.out.println(floor2[j].getInfo());
                        }
                        house.add(getIterator(floor2));
                    }
                    else{
                        ArrayList<Room> floor3 = new ArrayList<Room>();
                        for (int j = 0; j < roomsOnFloor; j++) {
                            floor3.add(new Room(RandomRoomType(), RandomArea()));
                            System.out.println(floor3.get(j).getInfo());
                        }
                        house.add(floor3.iterator());
                    }
                    break;
            }
        }
        Iterator<Iterator> houseIterator = house.iterator();
        int sum = 0;
        while (houseIterator.hasNext())
        {
            Iterator<Room> floorIterator = houseIterator.next();
            while (floorIterator.hasNext())
            {
                Room room = floorIterator.next();
                sum += room.area;
            }
        }
        System.out.println("Общая площадь: " + sum);
    }
}
