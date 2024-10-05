import java.util.Scanner;

public class MultiplyFloatingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
       
        
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
       
       
        double result = number1 * number2;
        System.out.println("The result of multiplication is: " + result);

       
        scanner.close();
    }
}
