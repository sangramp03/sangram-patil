import java.util.*;
public class LeapYearDec
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	int year;
 	System.out.println("enter year");
	 year=xyz.nextInt();

  		 if(year% 4==0)
		{
		System.out.println("leap year");
		}
		else
		{
		System.out.println("not leap year");
		}
	}
}