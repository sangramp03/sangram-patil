import java.util.*;
public class Quadrant
{
public static void main(String x1[])

	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter value 1-->");
	int x=xyz.nextInt();
        System.out.println("enter values 2-->");
	int y=xyz.nextInt();

	 if(x>=1 && y>=1)
	{
	System.out.println("1st quadrent");
	}
	
	else if(x<=-1 && y>=1)
	{
	System.out.println("2nd quadrent");
	}
	else if(x>=-1 && y<=-1)
	{
	System.out.println("3rd quadrent");
	}
	else if(x<=1 && y<=-1)
	{
	System.out.println("4th quadrent");
	}
	else
	{
	System.out.println("zero");
	}	
	}
} 