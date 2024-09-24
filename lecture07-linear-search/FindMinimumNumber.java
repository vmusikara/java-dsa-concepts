public class FindMinimumNumber {
    public static void main(String[] args) {
        int[] arr = {22, 65, 46, 34, 76, 89, 55, -1};

        System.out.println("Minimum Number ==> " + findMinimum(arr));
        System.out.println("Maximum Number ==> " + findMaximum(arr));
    }

    // assume the array is not empty
    // return the minimum value of the array
    static int findMinimum(int[] arr){
        // assume first element as the smallest or minimum
        int answer = arr[0];

        for (int index = 1; index < arr.length; index++) {
            // compare the assumed minimum(answer) to array elements,
            // if the array element is smaller than answer,
            if(arr[index] < answer){
                // then update answer to the array value
                answer = arr[index];
            }
        }

        return answer;
    }

    // assume the array is not empty
    // return the maximum value of the array
    static int findMaximum(int[] arr){
        // assume first element as the smallest or minimum
        int answer = arr[0];

        for (int index = 1; index < arr.length; index++) {
            // compare the assumed minimum(answer) to array elements,
            // if the array element is smaller than answer,
            if (arr[index] > answer){
                // then update answer to the array value
                answer = arr[index];
            }
        }

        return answer;
    }
}
