import java.util.Scanner;
public class Addscan
{
    public static void main(String[] args)
    {
        Scanner Scan=new Scanner(System.in);
        System.out.println("enter a value");
        int a=Scan.nextInt();
        Scanner scan=new Scanner(System.in);
        System.out.println("enter b value");
        int b=Scan.nextInt();
        scan.close();
        System .out.println(a+b);
    }

}