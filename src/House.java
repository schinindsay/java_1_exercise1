public class House {
    private int bedrooms;
    private double familyRoomArea;
    private double livingRoomArea;
    private String style;
    private double plot;

    //    House has two constructors:
    public House() {

    }

    public House(String newStyle, double newFamilyRoomArea, double newLivingRoomArea, int newBedrooms, double newPlot) {
        this.style = newStyle;
        this.familyRoomArea = newFamilyRoomArea;
        this.livingRoomArea = newLivingRoomArea;
        this.bedrooms = newBedrooms;
        this.plot = newPlot;
    }

    //    House has getters for all instance variables:
    public int getBedrooms() {
        return bedrooms;
    }

    public double getFamilyRoomArea() {
        return familyRoomArea;
    }

    public double getLivingRoomArea() {
        return livingRoomArea;
    }

    public double getPlot() {
        return plot;
    }

    public String getStyle() {
        return style;
    }

    public double getTotalArea() {
        double totalArea = (300 * bedrooms) + livingRoomArea + familyRoomArea;
        return totalArea;
    }

    public int compareArea(House otherHouse) {
        double comparison = ((300 * bedrooms) + livingRoomArea + familyRoomArea) - otherHouse.getTotalArea();

        if(comparison < 0) {
            return -1;
        }
        else if (comparison > 0 ) {
            return 1;
        }
        else return 0;
    }

    public String toString() {
        return ( "House style=" + style + ", bedrooms=" + bedrooms + ", family room" +
                " area=" + familyRoomArea + ", living room area=" + livingRoomArea + ", plot=" + plot + ", square " +
                "feet=" + getTotalArea());
    }

    //    House has setters for all instance variables
    public void setBedrooms(int br){
        this.bedrooms = br;
    }

    public void setFamilyRoomArea(double frArea){
        this.familyRoomArea = frArea;
    }

    public void setLivingRoomArea(double lrArea){
        this.livingRoomArea = lrArea;
    }

    public void setPlot(double acreage){
        this.plot = acreage;
    }

    public void setStyle(String houseStyle){
        this.style = houseStyle;
    }
}
