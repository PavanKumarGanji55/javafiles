class Funsq
{
 static void square()
 {
   System.out.println("squaring started");
   int n=6;
   int square=n*n;
   System.out.println(square);
   System.out.println("squaring ended"); 
 }
 public static void main(String[] args)
 {
  System.out.println("main started");
  square;
  System.out.println("main ended");
 }
}