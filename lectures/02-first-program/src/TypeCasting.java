import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);

        // ** Type Conversion
        System.out.println("** Automatic type-conversion OR widening");
        // taking integer input
//        System.out.print("Enter Integer Value: ");
        int myInt = 55;
        float myFloatNum = myInt; // automatic type-conversion OR widening

//        System.out.print("Enter Float Value: ");
        float myFloat = 69.34621F;
        double myDoubleNum = myFloat; // automatic type-conversion OR widening


        System.out.println("Integer Value: " + myInt + "    Float Conversion: " +myFloatNum);
        System.out.println("Float Value: " + myFloat + "    Double Conversion: " +myDoubleNum);

        // ** Type Casting OR Narrowing
        System.out.println("** Type Casting OR Narrowing");
        double num = 8575.4567892;
        int myNum = (int) num;
        float floatNumber = (float) num;

        System.out.println("Double : " +num+ "  Double to Int Conversion: " +myNum);
        System.out.println("Double: " +num+ "   Double to Float Conversion: " +floatNumber);
    }
}
