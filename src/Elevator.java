/**
 * Write a class Elevator that extends Room.  An Elevator class contains
 * an int instance variable for the current floor of the elevator
 * a getter for floor
 * a constructor that takes the area of the elevator as a parameter
 * a mutator void up(int floors) that increases the current floor by the parameter
 * a mutator void down(int floors) that decreases the current floor by the parameter
 * an accessor String toString() that returns the square feet and capacity of the elevator, as well as its current
 * floor.
 * **/

public class Elevator extends Room {
    private int floor;

    public int getFloor() {
        return floor;
    }

    public Elevator(int area) {
        super(area);
    }

    public void up(int floors) {
        floor += floors;
    }

    public void down(int floors) {
        floor -= floors;
    }

    public String toString() {
        return "capacity: " + getCapacity() + " current floor: " + getFloor();
    }
}
