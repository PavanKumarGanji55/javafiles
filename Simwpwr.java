class Simwpwr
{
 static double si(double p,double t,double r)
 {
  double res=p*t*r/100;
  return res;
 } 
public static void main(String[] args)
 {
  System.out.println(si(100,2,3));
 }
}