import java.util.*;
public class TriangleDecision
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	int a,b,c,sum;
	System.out.println("enter sides");
	 a=xyz.nextInt();
	 b=xyz.nextInt();
	 c=xyz.nextInt();
	sum=a+b+c;

	if(sum==180)
	{
	System.out.println("valid triangle");
	}

	else
	{
	System.out.println("invalid triangle");
	}
	}
}