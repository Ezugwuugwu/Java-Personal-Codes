package chapterThree;

import java.util.Scanner;

public class CarClass {
    private String carModel;
    private String year;
    private  double carPrice;

    public CarClass(String carModel, String year, double carPrice) {
        this.carModel = carModel;
        this.year = year;

        if (carPrice > 0.0) {
            this.carPrice = carPrice;
        }
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {

                this.carPrice = carPrice;
    }

    public double getDiscount(){
        double discount =( 5/100) * getCarPrice();

        return getCarPrice() - discount;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CarClass car1 = new CarClass("Toyota","2016", -50000);
        CarClass car2 = new CarClass("Lexus","2020", 1000000);

        System.out.println("Ordered car details for Car1: \nName - "+car1.getCarModel()+"\nYear - "+car1.getYear()+"\nPrice is "+car1.getCarPrice());
        System.out.println("\n\nOrdered car details for car2: \nName - "+car2.getCarModel()+"" +
                "\nYear - "+car2.getYear()+"\nPrice is "+car2.getCarPrice());
        System.out.println("New price "+car1.getDiscount());

        System.out.println("Enter the model of the car you want to buy");
        String name = input.nextLine();

        System.out.println("Enter the year of car you want to buy");
        String year = input.nextLine();

        System.out.println("enter the price of the car");
        double price = input.nextDouble();

        car1.setCarModel(name);
        car1.setYear(year);
        car1.setCarPrice(price);

        double discount = 5/100;
        System.out.println(discount);
        System.out.println("Ordered car details for Car1: \nName - "+car1.getCarModel()+"\nYear - "+car1.getYear()+
                "\nPrice is "+car1.getCarPrice()+"\nAfter discount, new price is "+car1.getCarPrice());



    }


}
