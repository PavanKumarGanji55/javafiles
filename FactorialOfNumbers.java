class FactorialOfNumbers
{
 public static void main(String[] args)
 {
  int i;
  int n=10;
  int fact=1;
  for(i=10;i>=1;i--)
  {
   fact=fact*i;
  }
  System.out.println(fact);
 }
}