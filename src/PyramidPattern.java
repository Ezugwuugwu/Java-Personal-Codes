public class PyramidPattern {
    public static void main(String[] args) {

        int row = 0;
        int innerCounter = 0;
        int k =0;

        for (row = 1; row <= 6; row++) {

            for (innerCounter = 1; innerCounter <= row; innerCounter++) {
                System.out.print(innerCounter + " ");
            }
            System.out.println();
        }

        System.out.println("\n\n");
        for (row = 6; row >= 1; row--) {
            for (innerCounter = 1; innerCounter <= row; innerCounter++) {
                System.out.print(innerCounter + " ");
            }
            System.out.println();
        }
        System.out.println();



//
//        for (row = 1; row<=6; row++) {
//
//            for (k = 1; k <= row; k++) {
//                System.out.println(" ");
//            }
//
//            for (innerCounter =1; innerCounter <= row-1; innerCounter++){
//                System.out.println(innerCounter);
//            }
//        }
//        System.out.println();

    }
}
