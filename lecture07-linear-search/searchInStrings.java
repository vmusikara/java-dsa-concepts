import java.util.Arrays;

public class searchInStrings {
    public static void main(String[] args) {
        String name = "mvbreddy";
        char target = 'v';

        boolean result = searchChar2(name, target);
        System.out.println(result);
        System.out.println(name);
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    // search the string for a target character and return true
    // otherwise if not found return false
    static boolean searchChar(String str, char target){
        if (str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }

    // use for-each loop to iterate over a string
    static boolean searchChar2(String str, char target){
        if (str.isEmpty()) {
            return false;
        }

        // convert the string to a character array
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }

        return false;
    }

}
