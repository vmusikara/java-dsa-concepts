import java.util.Scanner;

// Q: Take name as input and print a greeting message for that particular name.
public class StringName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Name to Greet: ");
        String name = input.nextLine(); // take input name from user.

        System.out.println("Greetings, " + name + ".");
    }
}
