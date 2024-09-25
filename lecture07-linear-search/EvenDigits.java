
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};

        System.out.println(findNumbers(nums));
    }

    // find the number of elements with even digits in an array
    // and return the count
    public static int findNumbers(int[] nums) {
        int count = 0;

        for(int number : nums){
            if(isEvenDigits(number)){
                count = count + 1;
            }
        }
        return count;
    }

    // find if the element has even number of digits or not
    // and return true or false
    static boolean isEvenDigits(int number) {
        int numOfDigits = countDigits(number);
        return numOfDigits % 2 == 0;
    }

    // count the count of digits are in an element and
    // return the count
    static int countDigits(int number) {
        int count = 0;

        // convert the negative number to positive number
        // to calculate
        if (number < 0){
            number = number * -1;
        }

        // in case of '0' as an element in the array,
        // its digit count is '1'
        if (number == 0){
            return 1;
        }

        while (number > 0){
            count = count + 1;
            number = number / 10;
        }
        return count;
    }
}
