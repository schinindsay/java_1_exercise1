import java.util.ArrayList;

public class Subdivision {

    private ArrayList<House> houses = new ArrayList<>();


    public Subdivision() {

    }


    public House get(int position){
        return houses.get(position);
    }

    public ArrayList <House> list() {
        return houses;
    }


    public ArrayList <House> listByArea(double floor, double ceiling) {
        ArrayList<House> houseByAreaList = new ArrayList<>();

        for(int i = 0; i < houses.size(); i++) {
            House h = houses.get(i);

            if( h.getTotalArea() >= floor && h.getTotalArea() <= ceiling ){
                houseByAreaList.add(h);
            }
        }

        return houseByAreaList;
    }


    public ArrayList <House> listByBedrooms(int floor, int ceiling) {
        ArrayList<House> houseByBedroomsList = new ArrayList<>();

        for(int i = 0; i < houses.size(); i++) {
            House h = houses.get(i);

            if(h.getBedrooms() >= floor && h.getBedrooms() <= ceiling) {
                houseByBedroomsList.add(h);
            }
        }

        return houseByBedroomsList;
    }


    public int size() {
        return houses.size();
    }


    public String toString() {
        return houses.toString();
    }


    public boolean add(House houseToAdd) {
        return(houses.add(houseToAdd));
    }




//    ArrayList < House > listByPlot(double floor, double ceiling)
//    returns list of Houses (in the order they were originally added to the subdivision)
//    whose plot size is greater than or equal to floor, and less than or equal to ceiling.
//    If there are no such houses, an empty list is returned.

    public ArrayList <House> listByPlot(double floor, double ceiling) {
        ArrayList<House> houseByPlotList = new ArrayList<>();

        for(int i = 0; i < houses.size(); i++) {
            House h = houses.get(i);

            if(h.getPlot() >= floor && h.getPlot() <= ceiling) {
                houseByPlotList.add(h);
            }
        }

        return houseByPlotList;
    }

//    ArrayList < House > sortByArea() returns a sorted list of all houses.
//    The house with the smallest total area is listed first,
//    and the house with the largest total area is listed last.
//    If the subdivision is empty, an empty list is returned.
//    This method is based on the book's SelectionSort method, which is attached to this Item.
//    This method also relies on House's compareArea method to compare houses.
    public ArrayList<House> sortByArea() {
        ArrayList<House> housesByArea = new ArrayList<>();

        for(int x = 0; x < houses.size(); x++ ) {
            House h = houses.get(x);
            housesByArea.add(h);
        }

        for (int i = 0; i < housesByArea.size(); i++) {
        // find position of smallest num between (i + 1)th element and last element
            int pos = i;

            for (int j = i; j < housesByArea.size(); j++) {
              House h1 = housesByArea.get(pos);
              House h2 = housesByArea.get(j);
              if (h2.compareArea(h1) < 0)
                pos = j;
            }

            // Swap min to current position on array
            House min = housesByArea.get(pos);
            housesByArea.set(pos, housesByArea.get(i));
            housesByArea.set(i, min);
        }

        return housesByArea;
    }




//    ArrayList < House > sortByPlot() returns a sorted list of all houses.
//    The house with the smallest plot is listed first, and the house with the largest plot is listed last.
//    If the subdivision is empty, an empty list is returned.
//    This method is based on the book's SelectionSort method, which is attached to this Item.

    public ArrayList<House> sortByPlot() {
        ArrayList<House> housesByPlot = new ArrayList<>();

        for(int x = 0; x < houses.size(); x++ ) {
            House h = houses.get(x);
            housesByPlot.add(h);
        }

        for (int i = 0; i < housesByPlot.size(); i++) {
            // find position of smallest num between (i + 1)th element and last element
            int pos = i;

            for (int j = i; j < housesByPlot.size(); j++) {
                House h1 = housesByPlot.get(pos);
                House h2 = housesByPlot.get(j);

                double h1Plot = h1.getPlot();
                double h2Plot = h2.getPlot();

                if (h2Plot < h1Plot)
                    pos = j;
            }

            // Swap min to current position on array
            House min = housesByPlot.get(pos);
            housesByPlot.set(pos, housesByPlot.get(i));
            housesByPlot.set(i, min);
        }

        return housesByPlot;
    }

}

