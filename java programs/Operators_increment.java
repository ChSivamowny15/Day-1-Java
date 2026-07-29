class Operators_increment{
    public static void main(String args[]) {
        int a = 10;
        int b = 15;
        int c = 6;
        b = a++;
        b = ++a;
        a = ++c;
        a = ++b;
        System.out.println("a++ :" +a);
        System.out.println("b++ :" +b);
        System.out.println("c++ :" +c);
        System.out.println("After incrementing value of a :" +a );
        System.out.println("After incrementing value of b :" +b);
        System.out.println("After incrementing value of c:" +c);
    }
}
