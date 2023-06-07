public class ArrayExample {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        double[] array2 = new double[10];

        // Insert values into array1
        array1[0] = 2;
        array1[1] = 5;
        array1[2] = 8;
        array1[3] = 12;
        array1[4] = 17;
        array1[5] = 21;
        array1[6] = 24;
        array1[7] = 29;
        array1[8] = 33;
        array1[9] = 36;

        // Insert values into array2
        array2[0] = 1.5;
        array2[1] = 2.8;
        array2[2] = 3.2;
        array2[3] = 4.7;
        array2[4] = 6.1;
        array2[5] = 8.4;
        array2[6] = 9.9;
        array2[7] = 11.3;
        array2[8] = 12.7;
        array2[9] = 14.2;

        // Read and print the elements from array1
        System.out.println("Elements of array1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        // Read and print the elements from array2
        System.out.println("Elements of array2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
