import java.util.*;
public class Que7
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter three numbers ");
	int a=xyz.nextInt();
	int b=xyz.nextInt();
	int c=xyz.nextInt();
	
	if(a>=b && a>=c)
	{System.out.println("first one is greater ");}
	
	else if(b>=a && b>=c)
	{System.out.println("second one is greater ");}

	else
	{System.out.println("third one is greater ");}

	}
}