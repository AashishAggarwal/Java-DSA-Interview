package Arrays;

// Given a sorted array, can you re-arrange the elements such that the first position will have the largest 
// number, the second will have the smallest, the third will have the second-largest, and so on. 

public class CheckMaxMin {


    // New Array - O(n)
    public static void maxMin(int[] arr) {
        // Create a result array to hold re-arranged version of given arr
        int[] result = new int[arr.length];

        int pointerSmall = 0; // PointerSmall => Start of arr
        int pointerLarge = arr.length - 1; // PointerLarge => End of arr

        // Flag which will help in switching between two pointers
        boolean switchPointer = true;

        for (int i = 0; i < arr.length; i++) {
            if (switchPointer)
                result[i] = arr[pointerLarge--]; // copy large values
            else
                result[i] = arr[pointerSmall++]; // copy small values

            switchPointer = !switchPointer; // switching between samll and large
        }

        for (int j = 0; j < arr.length; j++) {
            arr[j] = result[j]; // copying to original array
        }
    }

    // Using extra O(1) space and maths
    public static void maxMin1(int[] arr) {
        int maxIdx = arr.length - 1;
        int minIdx = 0;
        int maxElem = arr[maxIdx] + 1; // store any element that is greater than the maximum element in the array 
        for( int i = 0; i < arr.length; i++) {
          // at even indices we will store maximum elements
          if (i % 2 == 0){  
            arr[i] += (arr[maxIdx] % maxElem ) * maxElem;
            maxIdx -= 1;
          }
          else { // at odd indices we will store minimum elements
            arr[i] += (arr[minIdx] % maxElem ) * maxElem;
            minIdx += 1;
          }
        }
        // dividing with maxElem to get original values.
        for( int i = 0; i < arr.length; i++) {
          arr[i] = arr[i] / maxElem;
        }
      }

    public static void main(String args[]) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.print("Array before min/max: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        maxMin1(arr);

        System.out.print("Array after min/max: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
