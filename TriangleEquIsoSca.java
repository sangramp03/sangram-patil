import java.util.*;
public class TriangleEquIsoSca
{
public static void main(String x[])
	{
	int side1,side2,side3;
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter side 1");
	side1=xyz.nextInt();
	System.out.println("enter side 2");
	side2=xyz.nextInt();
	System.out.println("enter side 3");
	side3=xyz.nextInt();
	String result=(side1==side2 && side2==side3)?"equilateral":(side1==side2||side2==side3||side3==side1)?"isoscale":"scalene";
	System.out.println(result);
	}
}