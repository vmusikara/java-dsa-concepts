public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, 12, -2, 0, 2, 3, 4, 12, 15, 17, 19, 22, 25, 47, 78, 89, 100, 111};

        int target = 99;
        int answer = binarySearch(arr, target);
        System.out.println(answer);
    }

    // return index of the target element,
    // return -1 if the target element does not exist
    static int binarySearch(int[] arr, int target){
        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex <= endIndex){
            // find the midIndex,
            // this way we can calculate easily as the input of int does not exceed bounds
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            if (target < arr[midIndex]){
                // search the left-part of the array,
                // so endIndex is moved to left side of midIndex
                endIndex = midIndex - 1;
            } else if (target > arr[midIndex]) {
                // search the right-part of the array,
                // so startIndex is moved to right side of midIndex
                startIndex = midIndex + 1;
            } else {
                // element found, return midIndex
                return midIndex;
            }
        }
        // element not found
        return -1;
    }
}