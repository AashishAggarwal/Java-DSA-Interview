package Arrays;

// Find the second maximum in an array of size n

public class CheckSecondMax {

    // Traversing array twice - O(n)
    public static int findSecondMaximum(int[] arr) {

        int secondMax = Integer.MIN_VALUE;
        int maximum = findMaximum(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] < maximum) {
                secondMax = arr[i];
            }
        }
        return secondMax;

    }

    public static int findMaximum(int[] arr) {

        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }

        return maximum;
    }

    // Traversing array once - O(n) -  Optimized
    public static int findSecondMaximum2(int[] arr) {

        int max = Integer.MIN_VALUE;
        ;
        int secondmax = Integer.MIN_VALUE;

        // Keep track of Maximum value, whenever the value at an array index is greater
        // than current Maximum value then make that max value 2nd max value and
        // make that index value maximum value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            } else if (arr[i] > secondmax && arr[i] != max) {
                secondmax = arr[i];
            }
        } // end of for-loop

        return secondmax;
    } // end of findSecondMaximum

    public static String arrayToString(int arr[]) {
        if (arr.length > 0) {
            String result = "";
            for (int i = 0; i < arr.length; i++) {
                result += arr[i] + " ";
            }
            return result;
        } else {
            return "Empty Array!";
        }
    }

    public static void main(String args[]) {

        int[] arr = { -2, -33, -10, -456 };

        System.out.println("Array: " + arrayToString(arr));

        int secMax = findSecondMaximum(arr);

        System.out.println("Second maximum: " + secMax);

    }

}
