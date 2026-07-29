import java.util.Scanner;
class Biggest_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b =  sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();
        System.out.println(a>b?a>c?"a is big":"c is big":b>c?"b is big":"c is big");
    }
}