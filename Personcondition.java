class Personcondition
{
    public static void main(String[] args)
    {
        int n=30;
        if(n%2==1)
        {
            System.out.println("weird");
        }
        else if((n%2==0) && (n<=5 && n>=2))
        {
            System.out.println("not weird"); 
        }
        else if((n%2==0) && (n<=20 && n>=6))
        {
            System.out.println("weird");
        }
        else if((n%2==0) && n>20)
        {
              System.out.println("not weird");
        }

    }
}