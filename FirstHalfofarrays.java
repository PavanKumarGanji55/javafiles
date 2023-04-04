class FirstHalfofarrays
{
    public static void main(String[] args)
    {
        int[] a={10,20,30,40,50,60};
        for(int i=a.length/2-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
        for(int i=a.length-1;i>=a.length/2;i--)
        {
            System.out.println(a[i]);
        }
    }
}