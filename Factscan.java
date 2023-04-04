import java.util.Scanner;
public class Factscan
{
    public static void main(String[] args)
    {
        Scanner Scan=new Scanner(System.in);
        for(int i=1;i<=5;i++)
        {
            int fact=1;
            System.out.println("enter n value");
            int n=Scan.nextInt();
            for(int j=1;j<=5;j++)
            {
                fact=fact*i;
            }
            System.out.println(fact);
        }
        Scan.close();

    }
}