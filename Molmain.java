public class Molmain
{
 public static void main(int a,int b)
 {
  int sum=a+b;
  System.out.println(sum);
 }
 public static void main()
 {
  int a=20;
  int sqr=a*a;
  System.out.println(sqr);
 }
public static void main(double p,double t,double r)
 {
  double si=p*t*r/100;
  System.out.println(si);
 }
public static void main(String[] args)
 {
  main(10,20);//1st
  main();
  main(100,2,2);//3rd
 }
}