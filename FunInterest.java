class FunInterest
{
 static double interest()
 {
   System.out.println("interest started");
   int p=10;
   int t=20;
   int r=10;
   double interest=p*t*r/100;
   System.out.println(interest);
   System.out.println("interest ended"); 
    return interest;
 }
 public static void main(String[] args)
 {
  System.out.println("main started");
  interest();
  System.out.println("main ended");
 }
}