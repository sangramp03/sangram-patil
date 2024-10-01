import java.util.*;
public class Addition
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter two values");
	int a=xyz.nextInt();
	int b=xyz.nextInt();
	int c=a+b;
	System.out.printf("addition is %d\n",c);
	int d=c/2;
	System.out.printf("average is %d\n",d);
	}
}