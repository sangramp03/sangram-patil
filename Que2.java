import java.util.*;
public class Que2
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter days");
	int days=xyz.nextInt();
	int year=days/365;
	int month=days%10;
	int weeks=month%10;
	int rdays=weeks%10;
	System.out.println("yers:"+year);
	System.out.println("month:"+month);
	System.out.println("weeks:"+weeks);
	System.out.println("remaining days:"+rdays);
	}
}
	
	