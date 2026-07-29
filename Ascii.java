import java.util.Scanner;
class Ascii
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char c = sc.next().charAt(0);
        int a = c;
        System.out.print(c + "ascii_ " + a);

    }
}
