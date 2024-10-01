import java.util.*;
public class Employee
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter age");
	int age=xyz.nextInt();
	System.out.println("enter gender");
	char g=xyz.next().charAt(0);	
	System.out.println("enter marital status");
	char ms=xyz.next().charAt(0);
	char married='m';	
	char unmarried='u';
	char employee='e';
	char m;
	char f;	

	  if(ms=='u' && g=='m' && age>=30)
	{
	   System.out.println("Eligible for insurence");
	}
	 else if(ms=='u' && g=='f' && age>=25)
	{
	   System.out.println("Eligible for insurence");
	}
	 else
	{
	   System.out.println("not eligible for insurance");
	}
	}
}