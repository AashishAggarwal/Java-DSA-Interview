package Arrays;

// Given an array, return an array where each index stores the 
// product of all numbers except the number on the index itself. 

public class checkProduct {

    // Brute force method - O(n^2)
    public static int[] findProduct(int[] arr) {

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    product *= arr[j];
                }
            }
            result[i] = product;
        }

        return result;
    }

    // Optimized solution - O(n)
    public static int[] findProduct1(int arr[]) {
        int n = arr.length;
        int i, temp = 1;

        // Allocation of result array
        int result[] = new int[n];

        // Product of elements on left side excluding arr[i]
        for (i = 0; i < n; i++) {
            result[i] = temp;
            temp *= arr[i];
        }

        // Initializing temp to 1 for product on right side
        temp = 1;

        // Product of elements on right side excluding arr[i]
        for (i = n - 1; i >= 0; i--) {
            result[i] *= temp;
            temp *= arr[i];
        }

        return result;
    }

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

        int[] arr = { -1, 2, -3, 4, -5 };

        System.out.println("Array before product: " + arrayToString(arr));

        int[] prodArray = findProduct1(arr);

        System.out.println("Array after product: " + arrayToString(prodArray));
    }
}