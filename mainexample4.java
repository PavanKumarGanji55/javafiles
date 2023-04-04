class Mainexample4
{
   int a;//non static variable

    public void test()
    {
      int a=10;// static variable
      System.out.println(a);
      System.out.println(this.a);
    }
    public static void main(String[] args)
    {
        new Mainexample().test();
    }
}