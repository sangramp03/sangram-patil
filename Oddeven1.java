import java.util.*;
public class Oddeven1
{
public static void main(String x[])
   {  Scanner s = new Scanner(System.in);
 
System.out.println("enter number");
int n= s.nextInt();
String result=(n%2==0)?"even":"odd";
System.out.println("result" +result);
      }  

}