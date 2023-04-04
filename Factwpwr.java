class Factwpwr
{
    static int fact(int a)
    {
        int fact=1;
        for(int i=5;i>=1;i--)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        System.out.println(fact(5));
    }
}