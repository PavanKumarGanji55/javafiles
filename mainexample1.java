class Mainexample1
{
     int a;//non static variable

    public static void test()
    {
      int a=10;//static variable
      System.out.println(a);
      System.out.println(new Mainexample1().a);
    }
    public static void main(String[] args)
    {
        test();
    }
}