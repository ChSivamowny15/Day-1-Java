
import java.util.Scanner;
class Reverse {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        b = sc.nextInt();

        // Swapping the values
        c = a;
        a = b;
        b = c;

        System.out.println("After swapping, value of a: " + a);
        System.out.println("After swapping, value of b: " + b);

        sc.close();
    }
}