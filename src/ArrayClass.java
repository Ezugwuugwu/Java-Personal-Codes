public class ArrayClass {
    public static void main(String[] args) {

        int [][] arrays1 = {{30,40, 64,56}, {60,67,80,89}};
        int [][] arrays2 = {{10, 40, 50, 32}, {50,35,78,90}};
        System.out.printf("%s %5s %5s %5s ", "Col1","col2","col3","col4");
        System.out.println();
        Display(arrays1);
        print("\tArray Elements 2\n");
        System.out.printf("%s %5s %5s %5s ", "Col1","col2","col3","col4");
        System.out.println();
        Display(arrays2);
        }
        
        public static void Display(int [][] numbers){
        for (int row = 0; row <numbers.length; row++){
            for (int column =0; column < numbers[row].length; column++){
                System.out.print(numbers[row][column]+"    ");
            }
            System.out.println();
        }
        
        }

        public static void print(String message){
            System.out.println();
        }
}
