import java.util.*;
public class MaximumNum
{
  public static void main(String x[])
   { 
      Scanner s = new Scanner(System.in);
      System.out.println("enter num1");
      int num1= s.nextInt();
      System.out.println("enter num2");
      int num2= s.nextInt();
      String result=(num1>num2)?"maximum":"minimum";
      System.out.println("result: "+result);
   }
}
      

