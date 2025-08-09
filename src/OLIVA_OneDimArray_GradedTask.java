public class OLIVA_OneDimArray_GradedTask {
    public static void main(String[] args) {
        int[] integerArray = new int[10];

        System.out.println("A one-dimensional array with 10 elements: ");
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = 1 + i;
            System.out.printf("%d ", integerArray[i]);
        }

        int[] newIntArray = new int[20];

        int sum = 0;

        System.out.println("\nA one-dimensional array with 20 elements contains: ");
        for (int i = 0; i < newIntArray.length; i++) {
            newIntArray[i] = 2 * i;
            System.out.printf("%d  ", newIntArray[i]);
            sum += newIntArray[i];
        }
        System.out.printf("\nSum of all values in newIntArray: %d", sum);
    }
}
