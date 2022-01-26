package Arrays;
// Given an array, can you re-arrange its elements in such a way that the negative 
// elements appear at one side and positive elements appear at the other

public class CheckReArrange {

    // Using new array - O(n)
    // Re-Arrange Positive and Negative Values of Given Array
    public static void reArrange1(int arr[]) {

        int[] newArray = new int[arr.length];
        int newArrayIndex = 0;

        // Fill newArray with Negative Values first.
        // Then fill it with postive values.
        // In the end, insert every element of newArray back into original arr.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                newArray[newArrayIndex++] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 0)
                newArray[newArrayIndex++] = arr[i];
        }

        for (int j = 0; j < newArrayIndex; j++) {
            arr[j] = newArray[j];
        }
    }

    // Re-arranging in palce by swapping - O(n)
    public static void reArrange(int[] arr) {
        
        int i = -1;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void main(String args[]) {

        int[] arr = { 2, 4, -6, 8, -5, -10 };

        System.out.print("Array before re-arranging: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        reArrange(arr);

        System.out.print("Array after rearranging: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

}
