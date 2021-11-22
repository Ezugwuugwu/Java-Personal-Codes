import java.security.SecureRandom;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
//        SecureRandom randomNumbers = new SecureRandom();
//        int counter =1;
//
//
//       for (int i =1; i <= 60000; i++){
//           int face = 1 + randomNumbers.nextInt(6);
//
//           System.out.print(face+"  ");
////           if (i % 2 ==0)
////               System.out.println();
//       }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Integer value");
        int number = input.nextInt();

        System.out.println("Enter double value ");
        double numb = input.nextDouble();

        System.out.println("The int value is "+square(number));
        System.out.println("The double value is "+square(numb));

    }

    public static int square(int intValue){

        return intValue * intValue;
    }

    public static double square(double doubleValue){
        return doubleValue * doubleValue;
    }
}
