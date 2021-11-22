import java.util.Scanner;

public class Gradesclass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter =1;
        int total =0;

        System.out.println("Enter your grade or -1 to terminate");
        int grade = input.nextInt();

        while (grade != -1){
            counter = counter+1;
            total = total + grade;

            System.out.println("Enter your grade or -1 to terminate");
            grade = input.nextInt();

        }

        double avg = (double) total/10;//casting
        System.out.println("Total number is "+total);
        System.out.println("The average score is "+avg);
            }
    }
