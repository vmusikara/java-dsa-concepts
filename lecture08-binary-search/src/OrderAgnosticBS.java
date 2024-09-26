public class OrderAgnosticBS {
    public static void main(String[] args) {
        // ascending order sorted array
        // int[] ascArr = {-18, 12, -2, 0, 2, 3, 4, 12, 15, 17, 19, 22, 25, 47, 78, 89, 100, 111};

        // descending order sorted array
        int[] descArr = {99, 88, 77, 66, 54, 43, 39, 36, 28, 22, 19, 15, 11, 9, 7, 6, 4, 2, 1, 0, -1};

        int target = 77;

        int answer = orderAgnosticBS(descArr, target);
        System.out.println(answer);
    }


    static int orderAgnosticBS(int[] arr, int target){
        int startIndex = 0;
        int endIndex = arr.length - 1;

        // find whether array is sorted in ascending or descending order
        boolean isAsc = arr[startIndex] < arr[endIndex];

        while(startIndex <= endIndex){
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            // common for both ascending and descending order sorted array
            if (arr[midIndex] == target){
                return midIndex;
            }

            if(isAsc){
                // ascending order sorted array
                if(target < arr[midIndex]){
                    endIndex = midIndex - 1;
                } else {
                    startIndex = midIndex + 1;
                }
            } else {
                //descending order sorted array
                if(target > arr[midIndex]){
                    endIndex = midIndex - 1;
                } else {
                    startIndex = midIndex + 1;
                }
            }
        }

        return -1;
    }
}
