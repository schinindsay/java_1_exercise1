/**
 * Write a class Room.
 * A Room class contains an int instance variable for the area (in square feet) of the room
 * one constructor that takes the area of the room as a parameter
 * an accessor, int getSquareFeet() that returns the area of the room
 * a mutator, setSquareFeet(int area) that sets the square feet of the room
 * an accessor, int getCapacity() that returns the capacity of the room.  The capacity is given by dividing the
 * square feet by 9 (using integer division).
 * an accessor, String toString() that returns the square feet and capacity of the room.
 * **/


public class Room {
    private int area;

    public Room( int area ) {
        setSquareFeet(area);
    }

    public int getSquareFeet() {
        return area;
    }

    public int getCapacity() {
        return area / 9;
    }

    public void setSquareFeet(int area) {
        this.area = area;
    }

    public String toString() {
        return "area: " + getSquareFeet() + " capacity: " + getCapacity();
    }

}
