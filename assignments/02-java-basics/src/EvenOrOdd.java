import java.util.Scanner;
// Q: Write a program to print whether a number is even or odd, also take input from the user.
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int myNumber = input.nextInt(); // take input from user

        if(myNumber % 2 == 0){ // check for even or odd number
            System.out.println("Entered number " + myNumber + " is Even number.");
        } else {
            System.out.println("Entered number " + myNumber + " is Odd number.");
        }
    }
}