import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int r = scanner.nextInt(); 
        int original = r; 
        int sum = 0; 
        
       
        while (r > 0) {
            int n = r % 10; 
            sum = (sum * 10) + n; 
            r = r / 10; 
        }

        
        if (original == sum) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

        scanner.close();
    }
}
