class Swap {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        int c = 4;
        a = a+b+c;
        b = a-(b+c);
        c = a-(b+c);
        a = a-(b+c);
    System.out.println("a is :"+a);
    System.out.println("b is : "+b);
    System.out.println("c is : "+c);
    }
}
