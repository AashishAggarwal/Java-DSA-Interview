package Arrays;

public class MaxInBitonicArray {
    
// Brute force, check for first decrease, else return last element as maximum - O(n)
  public static int findMax(int[] arr) {
    // TODO: Write your code here
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i + 1] < arr[i]) {
            return arr[i];
        }
    }

    return arr[arr.length - 1];
  }

  public static int findMax1(int[] arr) {
    //   Binary search order agnostic method - O(logn)
    int start = 0, end = arr.length - 1;
    while (start < end) {
        int mid = (start + end) / 2;
        if (arr[mid] > arr[mid + 1]) {
            end = mid;
        } else {
            start = mid + 1;
        }
    }
    return arr[start];
  }

  public static void main(String[] args) {
    System.out.println(MaxInBitonicArray.findMax1(new int[] { 1, 3, 8, 12, 4, 2 }));
    System.out.println(MaxInBitonicArray.findMax1(new int[] { 3, 8, 3, 1 }));
    System.out.println(MaxInBitonicArray.findMax1(new int[] { 1, 3, 8, 12 }));
    System.out.println(MaxInBitonicArray.findMax1(new int[] { 10, 9, 8 }));
  }

}
