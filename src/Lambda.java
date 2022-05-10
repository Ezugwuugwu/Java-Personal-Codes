import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda {
    public void all(){
        Scanner input = new Scanner(System.in);

        IntBinaryOperator intBinaryOperator = (number1, number2) -> number1 * number2;
        System.out.println("Enter first Number");
        int firstNumber = input.nextInt();

        System.out.println("Enter second Number");
        int secondNumber = input.nextInt();
        System.out.println(intBinaryOperator.applyAsInt(firstNumber, secondNumber));
    }


    public static void main(String[] args) {
//        Lambda lam = new Lambda();
//        lam.all();

        streamInteger();
    }


    private static void streamInteger() {
        int [] values = {1,3,4,57,8,99,90,98};

        System.out.printf("List of values: %s%n", Arrays.toString(values));

        System.out.println("values are:");
        IntStream.of(values)
                 .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        System.out.println("Sum is "+ IntStream.of(values).sum());
        System.out.println("Count is "+ IntStream.of(values).count());
        System.out.println("Average is "+ IntStream.of(values).average().getAsDouble());
        System.out.println("Min is "+ IntStream.of(values).min().getAsInt());
        System.out.println("Max is "+ IntStream.of(values).max().getAsInt());

        System.out.println("\n// even values displayed in sorted order");
        IntStream.of(values)
                .filter(value -> value % 2==0)
                .sorted()
                .forEach(System.out::println);

        System.out.println("\n// odd values multiplied by 10 and displayed in sorted order");
        IntStream.of(values)
                .filter(value -> value % 2 !=0)
                .map(value -> value * 10)
                .forEach(System.out::println);

        System.out.println("\n// sum range of integers from 1 to 10, last number exclusive");
        System.out.println(IntStream.range(1, 10).sum());

        System.out.println("\n// sum range of integers from 1 to 10, last number inclusive");
        System.out.println(IntStream.rangeClosed(1, 10).sum());

        System.out.println("\nsummary statistics:");
        System.out.println(
                IntStream.of(values).summaryStatistics()
        );


        //create a stream pipeline that locates the odd integers in an Int-
        //Stream, multiplies each odd integer by 10, sorts the values in ascending order and displays
        //each value followed by a space.
        int[] numbers = {5,65,765,32,5,32,556,67,23,45,43,87,6556};
        System.out.println("\nPRINTED!!!");
        IntStream.of(numbers)
                .filter(value -> value % 2 !=0)
                .map(value -> (int) (value *10.5))
                .sorted()
                .forEach(value -> System.out.printf("\n%d %s",value, " "));


        //Stream<Integer> Manipulations
        Integer [] no = {5,3,1,32,5,32,556,67,23,45,43,87,6556};
        System.out.printf("\nThe sorted Arrays: %s%n", Arrays.stream(no)
                .sorted()
                .collect(Collectors.toList()));


        System.out.println("\nOverloaded version of method stream, with start and end points");
        System.out.println(Arrays.stream(no, 0, no.length)
                                  .sorted()
                                   .toList());

        List<Integer> greaterThan100 = Arrays.stream(no)
                .filter(value -> value >10)
                .sorted()
                .collect(Collectors.toList());
        System.out.printf("\n The Sorted Values greater than 10: %s%n", greaterThan100);


        System.out.printf("\nSorting with greaterThan10 Object itself: %s%n", greaterThan100.stream()
                .filter(value -> value >10)
                .sorted()
                .collect(Collectors.toList())
        );


        String[] names = {"Max,Joy,Ala, Ada, Ben, Yusuf, Ekene, Lota"};
        System.out.println(Arrays.stream(names)
                .sorted()
                 .map(String::toUpperCase)
                .collect(Collectors.toList())
        );
    }
}
