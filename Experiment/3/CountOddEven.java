import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        // First pass: count the number of even and odd numbers
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Create two new arrays based on the counts
        int[] evenNumbers = new int[evenCount];
        int[] oddNumbers = new int[oddCount];

        // Reset counters to use as index for new arrays
        evenCount = 0;
        oddCount = 0;

        // Second pass: fill the new arrays
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers[evenCount++] = numbers[i];
            } else {
                oddNumbers[oddCount++] = numbers[i];
            }
        }

        // Print results
        System.out.println("Number of even numbers: " + evenNumbers.length);
        System.out.print("Even numbers: ");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Number of odd numbers: " + oddNumbers.length);
        System.out.print("Odd numbers: ");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Devansh Mittal 24CSU054");
        input.close();
    }
}