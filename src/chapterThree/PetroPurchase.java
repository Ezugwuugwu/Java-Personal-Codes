package chapterThree;

public class PetroPurchase {

    private String stationLocation;
    private String petrolType;
    private int petrolQuantity;
    private double pricePerLitre;
    private double percentageDiscount;

    public PetroPurchase(String stationLocation, String petrolType, int petrolQuantity,
                         double pricePerLitre, double percentageDiscount) {

        this.stationLocation = stationLocation;
        this.petrolType =petrolType;
        this.petrolQuantity = petrolQuantity;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getPetrolQuantity() {
        return petrolQuantity;
    }

    public void setPetrolQuantity(int petrolQuantity) {
        this.petrolQuantity = petrolQuantity;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {

        this.percentageDiscount = percentageDiscount;
    }


    public double getPurchaseAmount(){

    double purChaseAmount = (getPetrolQuantity() * getPricePerLitre()) - getPercentageDiscount();

        return purChaseAmount;
    }

    public double getTotalAmount(){
        double totalAmount = getPetrolQuantity() * getPricePerLitre();
        return  totalAmount;

    }

    public static void main(String[] args) {
        PetroPurchase pet = new PetroPurchase("Abuja", "Fuel", 12, 250,6);


        System.out.println("\nThe initial details are;\nLocation of station: "+ pet.getStationLocation().toUpperCase()
                +"\nPetrol Type: "+ pet.getPetrolType().toUpperCase()+"\nPetrol quantity: "+pet.getPetrolQuantity()
                +"\nPetrol price: "+pet.getPricePerLitre()+ "\npercentage discount: "+pet.getPercentageDiscount());



        System.out.println("price without discount is "+pet.getTotalAmount());
        System.out.println();
        System.out.println("Your purchase amount is now "+pet.getPurchaseAmount());

    }
}
