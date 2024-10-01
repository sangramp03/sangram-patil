import java.util.*;
public class NumbersEqualNotEqu
{ 
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter number 1");
	int a=xyz.nextInt();
	System.out.println("enter number 2");
	int b=xyz.nextInt();
	String result=(a==b)?"numbers are equal":"numbers are not equal";
	System.out.println(result);	
	}
}