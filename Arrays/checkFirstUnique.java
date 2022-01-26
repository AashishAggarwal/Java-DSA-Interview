package Arrays;

// Given an array, find the first integer, which is unique in the array. Unique 
// means the number does not repeat and appears only once in the whole array.

public class checkFirstUnique {

    public static int findFirstUnique(int[] arr) {
        boolean isRepeated = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j] && i != j) {
                    isRepeated = true;
                    break;
                }
            } // end of InnerLoop

            if (isRepeated == false) {
                return arr[i];
            } else {
                isRepeated = false;
            }

        } // end of OuterLoop
        return -1;
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

        int[] arr = { 2, 54, 7, 2, 6, 54 };

        System.out.println("Array: " + arrayToString(arr));

        int unique = findFirstUnique(arr);
        System.out.print("First Unique in an Array: " + unique);

    }
}
