import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        
        if (n % 2 == 0) {
            System.out.println("Given Number is Even");
        } else {
            System.out.println("Given Number is Odd");
        }

        sc.close(); 
    }
}
