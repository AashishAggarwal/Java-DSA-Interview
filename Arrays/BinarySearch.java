package Arrays;

// Given a sorted array of integers, return the index
// of the given key. Return -1 if the key is not found.
public class BinarySearch {

    // Recursive solution - O(logn)
    public static int binSearchRec(int[] arr, int key) {
        return binarySearch(arr, key, 0, arr.length - 1);
    }

    public static int binarySearch(int[] a, int key, int low, int high){
        if (low > high){
            return -1;
        }
        
        int mid = (high + low) / 2;
        if (a[mid] == key){
            return mid;
        } else if (a[mid] > key) {
            return binarySearch(a, key, low, mid - 1);
        } else {
            return binarySearch(a, key, mid + 1, high);
        }
    }

    // Iterative solution - O(logn)
    public static int binSearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == key){
                return mid;
            } else if (arr[mid] > key){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 120, 133, 155, 162, 176, 188, 199, 200, 210, 222 };
        int[] inputs = { 10, 49, 99, 110, 176 };

        for (int i = 0; i < inputs.length; i++) {
            System.out.println("binSearch(arr, " + inputs[i] + ") = " + binSearch(arr, inputs[i]));
        }
    }

}
