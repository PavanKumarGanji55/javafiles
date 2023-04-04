class Patterns
{
 public static void main(String[] args)
 {
  int i;
  int j;
  int n=5;
  int k=1;
  for(i=1;i<=n;i++)
  {
   for(j=1;j<=n;j++)
   {
    System.out.printf("%2d",k);
    k++;
   }
  System.out.println(" ");
  }
 }
}