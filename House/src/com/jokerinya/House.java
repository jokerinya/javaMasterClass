package com.jokerinya;

public class House {
    private Room room1;
    private Room room2;
    private Room room3;
    private int price = 200;
    public static String EMPTY = "Empty";

    public House(Room room1){
        this(room1, new Room(EMPTY, -1,
                new CalculateVolume(-1,-1,-1)),
                new Room(EMPTY, -1,
                new CalculateVolume(-1,-1,-1))
        );
    }

    public House(Room room1, Room room2) {
        this(room1, room2,
                new Room(EMPTY, -1,
                        new CalculateVolume(-1,-1,-1)));
    }

    public House(Room room1, Room room2, Room room3) {
        this.room1 = room1;
        this.room2 = room2;
        this.room3 = room3;

    }

    public int getPrice() {
        if (!room2.getName().equals(EMPTY) && !room3.getName().equals(EMPTY)) {
            return this.price *= 3;
        }
        if ((room2.getName().equals(EMPTY) && room3.getName().equals(EMPTY))) {
            return this.price;
        }
        return this.price*2;
    }
    public double getTotalVolume() {
        return this.room1.getVolume() + this.room2.getVolume()+ this.room3.getVolume();
    }

    public void light(Room room) {
        room.lightUp();
    }
}
