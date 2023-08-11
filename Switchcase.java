import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int maxNumber = 0;

        switch (maxNumber) {
            case 1:
                maxNumber = num1;
                break;
            case 2:
                maxNumber = num2;
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        System.out.println("The maximum number is: " + maxNumber);
    }
}
