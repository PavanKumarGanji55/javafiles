import java.util.Scanner;
public class Squarescan
{
    public static void main(String[] args)
    {
        Scanner Scan=new Scanner(System.in);
        for(int i=1;i<=5;i++)
        {
        System.out.println("enter a value");
        int a=Scan.nextInt();
        System.out.println(a*a);}
        Scan.close();
        

    }
}