import java.util.Scanner;

public class Phase2 {
    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);
        System.out.println("How many houses would you like to add to the subdivision");
        int housesToAdd = kybd.nextInt();
        kybd.nextLine();

        Subdivision sd = new Subdivision();

        House house;

        for(int i = 0; i < housesToAdd; i++) {

            System.out.println("How many bedrooms will house " + (i+1) + " have?");
            int bedrooms = kybd.nextInt();

            System.out.println("How big is the family room for house " + (i+1) + " in square feet?");
            double familyRoom = kybd.nextDouble();

            System.out.println("How big is the living room for house " + (i+1) + " in square feet?");
            double livingRoom = kybd.nextDouble();

            System.out.println("How big is the plot for house " + (i+1) + " in acres?");
            double plot = kybd.nextDouble();

            System.out.println("What style is house " + (i+1) + "?");
            kybd.nextLine();
            String style = kybd.nextLine();

            House h = new House(style, familyRoom, livingRoom, bedrooms, plot);

            sd.add(h);
        }


        int size = sd.size();

        System.out.println("the size of the subdivision is " + size);
        System.out.println("the subdivision contains: ");
        for(int i = 0; i < size; i++) {
            System.out.println("house " + i + "\t" + sd.get(i));
        }

        System.out.println("Enter a floor value for total area: ");
        double totalAreaFloor = kybd.nextDouble();
        System.out.println("Enter a ceiling value for total area: ");
        double totalAreaCeiling = kybd.nextDouble();
        System.out.println("the houses whose total area are between the floor and ceiling values entered are: " + sd.listByArea(totalAreaFloor, totalAreaCeiling));

        System.out.println("Enter a floor value for number of bedroom: ");
        int bedroomFloor = kybd.nextInt();
        System.out.println("Enter a ceiling value for total area: ");
        int bedroomCeiling = kybd.nextInt();
        System.out.println("the houses whose number of bedrooms are between floor and ceiling values entered are: " + sd.listByBedrooms(bedroomFloor, bedroomCeiling));

        System.out.println("Enter a floor value for the plot acreage: ");
        int plotFloor = kybd.nextInt();
        System.out.println("Enter a ceiling value for the plot acreage: ");
        int plotCeiling = kybd.nextInt();
        System.out.println("the houses whose plots are between floor and ceiling values entered are: " + sd.listByPlot(plotFloor, plotCeiling));

        System.out.println("The houses sorted by square feet are:" + sd.sortByArea());

        System.out.println("The houses sorted by plot are:" + sd.sortByPlot());

    }
}
