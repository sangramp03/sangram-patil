import java.util.*;
public class TriangleValidInvalid
{
public static void main(String x[])
   {  Scanner s = new Scanner(System.in);
 
System.out.println("enter side1");
int side1= s.nextInt();
System.out.println("enter side2");
int side2= s.nextInt();
System.out.println("enter side3");
int side3= s.nextInt();
String result=(side1+side2+side3==180)?"valid":"invalid";
System.out.println("result is :"+result);

      }  

}