class Mainexample2
{
    static int a;// static variable

    public void test()
    {
      int a=10;// non-static variable
      System.out.println(a);
      System.out.println(Mainexample2.a);
    }
    public static void main(String[] args)
    {
        new Mainexample2().test();
    }
}