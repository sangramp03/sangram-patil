import java.util.*;
public class Maximum
{
 public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter num 1");
	int a=xyz.nextInt();
	System.out.println("enter num 2");
	int b=xyz.nextInt();
	System.out.println("enter num 3");
	int c=xyz.nextInt();
	String result=(a>=b)?"num1 is max":(a>=c)?"num2 is max":"num3 is max";
	System.out.println(result);
	
	}
}