import java.util.*;
public class MinimumNumer
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter first number");
	int a=xyz.nextInt();
	System.out.print("enter second number");
	int b=xyz.nextInt();
	System.out.print("enter third number");
	int c=xyz.nextInt();
	String result=(a<b && a<c)?"first is minimum":(b<a && b<c)?"second is minimum":"third is minimum";
	System.out.println(result);	

	}
}
