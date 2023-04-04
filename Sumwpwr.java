class Sumwpwr
{
    static int sum(int a)
    {
        int sum=0;
        for(int i=1;i<=5;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(sum(5));
    }
}