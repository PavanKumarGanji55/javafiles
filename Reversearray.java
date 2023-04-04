class Reversearray
{
    public static void main(String[] args)
    {
        int[] a={10,20,30,40,50};
        System.out.println("before reverse");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("after reverse");
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }


    }
}