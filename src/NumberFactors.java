import java.util.Scanner;

public class NumberFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("Enter a number to determine its factorials");
        int number = input.nextInt();
        int total =1;
            for (int i = 1; i < number; i++){
                    total = total * 1;
                    if (number % i ==0){

                        System.out.print(i);
                    }
//                System.out.println("Number of factorials is "+total);
//                    System.out.print(i+" "+"\n");
            }

    }
}
