import java.util.*;
public class DivisibleBy5or11
{
  public static void main(String x[])
   { 
      Scanner s = new Scanner(System.in);
      System.out.println("enter num");
      int num= s.nextInt();
      String result=(num % 5==0 && num % 11==0)?"divisible by 5 or 11":"not";
      System.out.println("result: "+result);
   }
}
      