import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        
        System.out.print("Enter the rate of interest (R) in percentage: ");
        double rate = scanner.nextDouble();

        
        System.out.print("Enter the time period (T) in years: ");
        double time = scanner.nextDouble();

        
        double simpleInterest = (principal * rate * time) / 100;

       
        System.out.printf("The simple interest is: %.2f%n", simpleInterest);

        
        scanner.close();
    }
}
