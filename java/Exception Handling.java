public class Exception Handling {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        int result;
        try {
            result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            
            System.out.println("Execution completed.");
        }
    }
}
