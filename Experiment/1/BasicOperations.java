import java.util.Scanner;

class BasicOperations {
    public static void main(String[] args) {
        int a, b, sum, sub, multi, div;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();

        sum = a + b;
        sub = a - b;
        multi = a * b;
        div = a / b;

        System.out.println("Sum is " + sum);
        System.out.println("Sub is " + sub);
        System.out.println("Multi is " + multi);
        System.out.println("Div is " + div);

        System.out.println("Devansh Mittal 24CSU054");
    }
}