import java.util.Scanner;

public class DoWhileClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mx = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int score =0;
        int counter =0;
        int total = 0;
//do {
//    total = total+ score;
//    counter = counter +1;
//    System.out.println("Enter grade ");
//    score = input.nextInt();
//
//}while (score != -42);
//        double average = (double) total/counter;
//        System.out.println("Total is "+total+" And average is "+average+" Number of input is  "+counter);


        String format = """
                
                enter -42 to stop registration
                """;
        System.out.println(format);

        while (score != -42){
            total = total +score;
            counter = counter +1;
            System.out.println("Enter grade ");
            score = input.nextInt();
            if (score == -42)
                break;

            if (mx < score)
                mx =score;

            if (min > score) {
                min = score;
            }
        }

        double average = (double) total/(counter-1);

        System.out.println("counter = "+(counter-1));
        System.out.println("total = "+total);
        System.out.println("Mxmum is "+mx);
        System.out.println("Minmum is "+min);
        System.out.println("Average is "+average);
    }
}
