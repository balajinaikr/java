public class MultipleCatchBlockEx {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];z
            arr[5] = 30 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBondExceptin");

        } catch (Exception e) {
            System.out.println("Exception: some other exception occure");

        }
        System.out.println("Rest of the code");
    }
}
