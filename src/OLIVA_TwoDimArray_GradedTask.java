public class OLIVA_TwoDimArray_GradedTask {
    public static void main(String[] args) {
        int[][] twoDimArray = {
                {2,4,5},
                {6,9,0},
                {11,7,1},
                {8,31,56}
        };

        //Displaying output using for-loop
        System.out.println("\nDisplaying output using for-loop:");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.printf("%d\t",twoDimArray[i][j]);
            }
            System.out.println();
        }

        //Displaying output using for-loop
        System.out.println("\nDisplaying output using ENHANCED for-loop:");
        for (int[] groupedIntegers : twoDimArray) {
            for (int number : groupedIntegers) {
                System.out.printf("%d\t", number);
            }
            System.out.println();
        }
    }
}
