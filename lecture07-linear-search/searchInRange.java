public class searchInRange {
    public static void main(String[] args) {

        int[] arr = {22, 65, 46, 34, 76, 89, 55, -1};
        int target = 99;

        int answer = searchRange(arr, target, 2,5);
        System.out.println(answer);
    }

    // search the array for the target element in a range(startIndex, endIndex) then return the index
    // of the element otherwise if not found return MAX_VALUE
    static int searchRange(int[] arr, int target, int startIndex, int endIndex){
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }

        for (int index = startIndex; index <= endIndex; index++) {
            // check for the target element in every index of array
            int element = arr[index];
            if (element == target){
                System.out.println("Size of the array is " +arr.length);
                return index;
            }
        }

        // if the element is not found
        return Integer.MAX_VALUE;
    }
}
