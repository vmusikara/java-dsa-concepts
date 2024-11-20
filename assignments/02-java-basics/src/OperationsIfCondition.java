import java.util.Scanner;
// Q: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class OperationsIfCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // enter user inputs numbers
        System.out.print("Enter first number: ");
        float number1 = input.nextFloat();
        System.out.print("Enter second number: ");
        float number2 = input.nextFloat();

        System.out.print("Enter the Operation to perform from the Operators [+, -, *, /]: ");
        // 'char' datatype doesn't have default scanner,
        // we use the next() to scan the string and charAt(0) to get the first character of the scanned string.
        char operator = input.next().charAt(0);

        // variable to store the result after performing operation.
        float result;

        // check the operator type and perform necessary operation using if conditions
        if (operator == '+'){
            result = number1 + number2;
            System.out.println("Number1: " + number1 + " " + operator + " Number2: " + number2 +
                    " Result == " + result);
        } else if (operator == '-') {
            result = number1 - number2;
            System.out.println("Number1: " + number1 + " " + operator  + " Number2: " + number2 +
                    " Result == " + result);
        } else if (operator == '*') {
            result = number1 * number2;
            System.out.println("Number1: " + number1 + " " + operator  + " Number2: " + number2 +
                    " Result == " + result);
        } else if (operator == '/') {
            if (number2 > 0){
                result = number1 / number2;
                System.out.println("Number1: " + number1 + " " + operator + " Number2: " + number2 +
                        " Result == " + result);
            } else {
                System.out.println("Number 2 must be greater than 0, when performing Division.");
            }
        } else {
            System.out.println("Enter an operator from the given list.");
        }

    }
}
