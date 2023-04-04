class Arrays
{
    public static void main(String[] args)
    {
        int[]a={10,20,10,25,10,10,30};
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);

    }
}