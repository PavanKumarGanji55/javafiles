class Mainexample
{
  static int a;//static variable

    public static void test()
    {
      int a=10;// static variable 
      System.out.println(a);
      System.out.println(Mainexample.a);
    }
    public static void main(String[] args)
    {
        test();
    }
}