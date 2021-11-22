public class Operators {
    public static void main(String[] args) {
       int year =1;
        System.out.printf("%s%20s", "Year","Amount on deposit");
        System.out.println();
        for (; year <= 10; year++){
            double amount = 1000 * Math.pow(1+0.05,year);

            System.out.println("   "+year+"          "+amount);
        }


    }
}
