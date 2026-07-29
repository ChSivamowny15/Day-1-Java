import java.util.Scanner;
class Range_of_digits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.println("Enter a number:");
        no = sc.nextInt();
        if(no>=0 && no<10)
        System.out.println("Single digit");
        else if(no>=10 && no<100)
        System.out.println("Double digit");
        else if(no>=100 && no<1000)
        System.out.println("Three digit");
        else if(no>=1000 && no<10000)
        System.out.println("Four digit");
        else
        System.out.println("Out of range");
    }
}