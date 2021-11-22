import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0, counter = 0, number = 0;
        int maximum = Integer.MIN_VALUE, minimum = Integer.MAX_VALUE;

        while (number != -42 ) {
            total = total + number;
            counter = counter + 1;
            System.out.println("Enter a number");
            number = input.nextInt();

            if (number == -42)
                break;

                if (maximum < number) {
                    maximum = number;
                }

                if (minimum > number){
                    minimum = number;
                }
        }
        double average = (double) total / (counter-1);

        System.out.println("Count is "+counter);
        System.out.println("Sum is "+total);
        System.out.println("Average is " + average);
        System.out.println("Minimum number is " + minimum);
        System.out.println("Maximum number is " + maximum);


    }

}
