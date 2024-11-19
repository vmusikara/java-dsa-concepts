import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter temperature in Celsius: ");

        float tempCelsius = input.nextFloat();

        float tempFahrenheit = (tempCelsius * 9 / 5) + 32;
        System.out.println("Temperature in Celsius :: " +tempCelsius+"  Temperature in Fahrenheit :: " + tempFahrenheit);
    }
}
