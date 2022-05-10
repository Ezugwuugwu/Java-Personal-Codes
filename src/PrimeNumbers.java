public class PrimeNumbers {
    public static void main(String[] args){

        boolean itsPrime = true;
        int counter =0;
        int nonPrime =0;

        for (int i =2; i <= 10; i++){
           itsPrime = true;

           for (int j =2; j < i; j++){
               if (i % j == 0){
                   itsPrime =false;
                   System.out.println(i);
               }
           }

           if (itsPrime){
               System.out.println(i);
               counter++;
           }
        }
        System.out.println("Number of prime numbers is "+counter);
    }
}
