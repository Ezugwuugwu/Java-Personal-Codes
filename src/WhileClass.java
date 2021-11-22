import java.util.Scanner;

public class WhileClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passed = 0;
        int failed = 0;
        int counter = 1;


        while (counter <= 10) {
            System.out.println("Enter score");
            int number = input.nextInt();
            if (number == 1) {
                passed = passed + 1;

            } else {
                if (number == 2) {
                    failed = failed + 1;
                }
            }
            counter = counter +1;
        }

        System.out.println("Number of passed is  " + passed);
        System.out.println("Number of failed is  " + failed);

        if (passed >8){
            System.out.println("Bonus to instructor");
        }

    }
}

