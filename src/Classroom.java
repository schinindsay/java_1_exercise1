/**
 * Write a class Classroom that extends Room.  A Classroom class contains
 * an int instance variable for the number of chairs in the classroom
 * a constructor that takes the area of the classroom as a parameter
 * a constructor that takes the area of the classroom and the number of chairs as parameters
 * getter and setter for chairs
 * an override for getCapacity.  The capacity of a classroom is the number of chairs.
 * an accessor, String toString() that returns the square feet and capacity of the room as well as the number of chairs.
 * **/

public class Classroom extends Room {
    private int chairs;

    public Classroom(int area) {
        this(area, 0);
    }

    public Classroom(int area, int chairs) {
        super(area);
        setChairs(chairs);
    }

    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }

    @Override
    public int getCapacity() {
        return getChairs();
    }

    public String toString() {
        return "area: " + getSquareFeet() + " capacity: " + getCapacity();
    }

}
