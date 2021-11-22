import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        int counter = 0;

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;


        while (counter <10) {
            System.out.println("Enter a number");
            int number = input.nextInt();
            total = total + number;
            counter = counter + 1;

            if (maximum < number) {
                maximum = number;
            }
            if (minimum > number){
                    minimum = number;
                }
            }
         double average = (double) total / counter;
            System.out.println("Total number is "+total);
            System.out.println("Counter is "+counter);
            System.out.println("Minimum number is " + minimum);
            System.out.println("Maximum number is " + maximum);
            System.out.println("Average of the number is " + average);
        }
    }

