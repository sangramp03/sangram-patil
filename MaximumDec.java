import java.util.*;
public class MaximumDec
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	int a,b;
	System.out.println("Enter value1 ");
	 a=xyz.nextInt();

	System.out.println("Enter values2 ");
	 b=xyz.nextInt();

	if(a>b)
	{
	System.out.println("greater value is value 1");
	}
	if(a<b)
	{
	System.out.println("greater value is value 2");
	}
	if(a==b)
	{	
	System.out.println("both are equal");
	}
	}
}