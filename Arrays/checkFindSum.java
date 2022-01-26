package Arrays;

public class checkFindSum {
    public static void main(String[] args) {
        
        int n = 9;
        int[] arr1 = { 2, 4, 5, 7, 8 };
        if (arr1.length > 0) {
            int[] arr2 = findSum(arr1, n);
            int num1 = arr2[0];
            int num2 = arr2[1];
            
            if ((num1 + num2) != n)
            System.out.println("Not Found");
            else {
                System.out.println("Number 1 = " + num1);
                System.out.println("Number 2 = " + num2);
                System.out.println("Sum = " + (n));
                
            }
        } else {
            System.out.println("Input Array is Empty!");
        }
    }
    
    // Brute force method - O(n^2)
    
    public static int[] findSum(int[] arr, int n) {
        int[] result = new int[2]; // Store the pair of values
        
        for (int i = 0; i < arr.length; i++) { // Traverse arr
            for (int j = i + 1; j < arr.length; j++) { // Traverse arr again
                if (arr[i] + arr[j] == n) { // find if sum is equal to n
                    result[0] = arr[i];
                    result[1] = arr[j];
                    return result; // return the pair of numbers
                }
            }
        }
        return arr; // return original arr if no pair found
    }
    

    // Optimized solution - O(nlogn)
    // Helper Function to sort given Array (Quick Sort)
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is <= to pivot
            if (arr[j] <= pivot) {
                i++;
                
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
    
    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
    
    // Return 2 elements of arr that sum to the given value
    public static int[] findSum1(int[] arr, int n) {
        // Helper sort function that uses the Quicksort Algorithm
        sort(arr, 0, arr.length - 1); // Sort the array in Ascending Order
        
        int Pointer1 = 0; // Pointer 1 -> At Start
        int Pointer2 = arr.length - 1; // Pointer 2 -> At End
        
        int[] result = new int[2];
        int sum = 0;
        
        while (Pointer1 != Pointer2) {
            
            sum = arr[Pointer1] + arr[Pointer2]; // Calulate Sum of Pointer 1 and 2
            
            if (sum < n)
            Pointer1++; // if sum is less than given value => Move Pointer 1 to Right
            else if (sum > n)
            Pointer2--;
            else {
                result[0] = arr[Pointer1];
                result[1] = arr[Pointer2];
                return result; // containing 2 number
            }
        }
        return arr;
    }
    
}
