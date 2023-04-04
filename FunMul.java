class FunMul
{
 static void multi(int x,int y)
 {
   System.out.println("multi started");
   int multi=x*y;
   System.out.println(multi);
   System.out.println("multi ended"); 
 }
 public static void main(String[] args)
 {
  System.out.println("main started");
  multi(2,10);
  System.out.println("main ended");
 }
}