class PersonMarks
{
 public static void main(String[] args)
 {
  int marks=70;


  if (marks>=80)
  {
   System.out.println("passed with distintion");
  }
   	 else if(marks>=60 && marks<=79)
  	{
      System.out.println("passed with first class");
  	}
     else if(marks>=50 && marks<=59)
     {
      System.out.println("passed with second class");
     }
     else if(marks>=35 && marks<=49)
     {
      System.out.println("pass");
  	}
     else if(marks>=0 && marks<=34)
     {
      System.out.println("fail");
     }
     else
     {
      System.out.println("invalid entry");
     }
       
  }
}
