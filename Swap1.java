class Swap1
{
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        System.out.println("a and b value before swapping"+a+"and"+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a and b value after swapping"+a+"and"+b);
    }
}