class ArraysCount
{
    public static void main(String[] args)
    {
        int count=0;
        int[]a={10,20,10,25,10,10,30};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==10)
            {
              count++;
            }
        }
        System.out.println(count);

    }
}