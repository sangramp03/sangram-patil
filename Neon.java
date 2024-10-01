import java.util.*;
public class Neon
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter number");
	int no=xyz.nextInt();
	int sq=no*no;
	int sum=(sq%10)+(sq/10);
	String result=(no==sum)?"neon":"not neon";
	System.out.println(result);
	}
}