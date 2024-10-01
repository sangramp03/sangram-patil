import java.util.*;
public class Que8
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	int a,b,c,choice;
	double pi=3.14;
	double s=0.43;
	System.out.println("enter number -->");
	a=xyz.nextInt();
	System.out.println("enter number -->");
	b=xyz.nextInt();
	System.out.println("enter number -->");
	c=xyz.nextInt();
	System.out.println("case1:area of rectangle ");
	System.out.println("case2:area of triangle ");
	System.out.println("case3:area of equilateral triangle");
	System.out.println("enter choice");
	choice=xyz.nextInt();
	
	switch(choice)
	{
	   case 1:
	{
	   System.out.println("area of rectangle"+(a*b));
	   break;
	}
	
	   case 2:
	{
	   System.out.println("area of triangle"+(pi*a*a));
	   break;
	}
	
	   case 3:	
	{
	   System.out.println((a>=b)?("area of equilateral triangle"+((s*a*a));
	   break;
	}
	   default:
	{
	    System.out.println("error:invalid input");
	   break;
	}
	}
	}
}