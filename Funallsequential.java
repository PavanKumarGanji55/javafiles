class Funallsequential
{
 static void add()
 {
  int a=100;
  int b=100;
  int sum=a+b;
  System.out.println(sum);
 }
 static void sqr(int a,int b)
 {
  int res=a*b;
  System.out.println(res);
 }
 static int pro()
 {
 int a=100;
 int b=4;
 int c=4;
 int pro=a*b*c;
  System.out.println(pro);   
 return pro;
 }
 static void si(double p,double t,double r)
 {
  double si=p*t*r/100;
 System.out.println(si);
 }
public static void main(String[] args)
 {
  add();
  si(100,4,2);
  sqr(1,20);
   pro();
 }
}
  
 