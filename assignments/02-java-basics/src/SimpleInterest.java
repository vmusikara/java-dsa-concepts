import java.util.Scanner;
// Q: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // take user inputs
        System.out.print("Enter Principal Amount: ");
        float principal = input.nextFloat();
        System.out.print("Enter Principal Amount Rate: ");
        float rate = input.nextFloat();
        System.out.print("Enter Time period in years: ");
        float timePeriod = input.nextFloat();

        // calculate Simple Interest using formula
        float simpleInterest = (principal * rate * timePeriod) / 100;

        System.out.println("Simple Interest for Principle amount : " + principal +
                " rate: " + rate +
                " Time period : " + timePeriod +
                " is ==> " +simpleInterest);
    }
}
