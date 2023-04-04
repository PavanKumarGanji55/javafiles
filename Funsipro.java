class Funsipro
{
static void si()
{ 
  System.out.println("si started");
  double p=100;
  double t=3;
  double r=3;
  double si=p*t*r/100;
  System.out.println(si);
  System.out.println("si ended");
}
 static void pro()
{
 System.out.println("product started");
 int a=2;
 int b=3;
 int c=3;
 int res=(a*b*c);

 System.out.println(res);
 System.out.println("product ended");
}

public static void main(String[] args)
 {
  pro();
 si();
 }
}