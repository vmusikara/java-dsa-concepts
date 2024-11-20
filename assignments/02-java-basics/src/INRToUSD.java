import java.util.Scanner;
// Q: Input currency in rupees and output in USD.
public class INRToUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float INRTOUSDRate = 0.012F;
        // enter user currency in INR to convert to USD
        System.out.print("Enter currency in INR: ");
        float currInINR = input.nextFloat();

        if (currInINR > 0){
            System.out.println(currInINR + " is equal to " + INRTOUSDRate * currInINR + " dollars.");
        }
    }
}
