package Arrays;

import java.util.Arrays;

public class FindMaxSubArray {
    
    // Brute force - O(n^2)
    public static int findMaxSumSubArray(int[] arr){

        int maxTillNow = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length; i++){
            int sum = 0;
            for (int j = i; j < arr.length; j++){
                sum += arr[j];
                if (sum > maxTillNow){
                    maxTillNow = sum;
                }
            }
        }
        return maxTillNow;
    }

    // Kadane's Algorithm - O(n)
    public static int findMaxSumSubArray1(int[] arr) {
        if (arr.length < 1) {
            return 0;
        }

        int currMax = arr[0];
        int globalMax = arr[0];
        int lengtharray = arr.length;
        for (int i = 1; i < lengtharray; i++) {
            if (currMax < 0) {
            currMax = arr[i];
            } else {
            currMax += arr[i];
            }

            if (globalMax < currMax) {
            globalMax = currMax;
            }
        }
        return globalMax;
    }

    public static void main( String args[] ) {
        int[] arr1 = {1, 7, -2, -5, 10, -1};
        System.out.println("Array: "+ Arrays.toString(arr1));
        System.out.println("Sum: " + findMaxSumSubArray1(arr1));
    }

    
}
