import java.util.*;
public class Voter
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter age");
	int age=xyz.nextInt();
	String result=(age>=18 && age<=100)?"eligible for voting":"not eligible for voting";
	System.out.println(result);	
	}
}