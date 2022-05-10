import java.util.Scanner;

public class EncryptionClass {
    public static void main(String[] args) {

            int digits;
            int copy;
            int number;
            int mod =0;

            Scanner input = new Scanner(System.in);
            System.out.println("Enter 4 digits");
            digits = input.nextInt();
            copy =digits;

       while (digits >0){
            digits = digits/10;
       }
        while (copy >0){

            number = copy %10;

            System.out.print(number +" ");  //Printing the seperated digits
            copy =copy/10;

            mod = (number +7) %10; //calculating each digit's modulo
            System.out.println("Modulo is "+mod);
        }

        }
    }

