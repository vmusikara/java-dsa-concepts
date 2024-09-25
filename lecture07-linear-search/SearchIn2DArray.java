import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr2D= {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 10, 5},
                {18, 12}
        };

        int target = 99;
        int[] answer = search2DArray(arr2D, target); // format of return value {row, col}
        System.out.println(Arrays.toString(answer));

        System.out.println("Maximum element in the array is ==> " +maxElement(arr2D));
    }

    static int[] search2DArray(int[][] arr2D, int target) {
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                if (arr2D[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }

    static int maxElement(int[][] arr2D){
        // assume a value as max for comparison
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr2D) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }

        return max;
    }

}
