import java.util.Scanner;
// Q: Take 2 numbers as input and print the largest number.
public class BigBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // take user inputs
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        // compare 2 numbers using if condition
        if (number1 > number2){
            System.out.println("Number1 is Largest. Number1:: " + number1);
        } else {
            System.out.println("Number2 is Largest. Number2:: " + number2);
        }
    }
}
