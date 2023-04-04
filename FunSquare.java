class FunSquare
{
 static void square(int a,int b)
 {
   System.out.println("square started");
   int square=a*b;
   System.out.println(square);
   System.out.println("square ended"); 
 }
 public static void main(String[] args)
 {
  System.out.println("main started");
  square(10,10);
  System.out.println("main ended");
 }
}