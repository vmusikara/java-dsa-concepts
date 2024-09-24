public class Main {
    public static void main(String[] args) {

        int[] arr = {22, 65, 46, 34, 76, 89, 55};
        int target = 89;

        boolean answer = linearSearch3(arr, target);
        System.out.println(answer);
    }

    // search the array for the target element then return the index of the element
    // otherwise if not found return MAX_VALUE
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }

        for (int index = 0; index < arr.length; index++) {
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

    // search the array for element and return the element
    static int linearSearch2(int[] arr, int target){

        for (int element : arr) {
            // check for the target element in every index of array
            if (element == target) {
                System.out.println("Size of the array is " + arr.length);
                return element;
            }
        }

        // if the element is not found
        return Integer.MAX_VALUE;
    }

    // search the array for element and return true or false
    static boolean linearSearch3(int[] arr, int target){

        for (int element : arr) {
            // check for the target element in every index of array
            if (element == target) {
                System.out.println("Size of the array is " + arr.length);
                System.out.println("The target element is in the array.");
                return true;
            }
        }

        // if the element is not found
        return false;
    }
}
