import java.util.*;
public class MenuDriven2
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	int a,b,choice;
	System.out.println("enter number -->");
	a=xyz.nextInt();
	b=xyz.nextInt();
	System.out.println("case1: positive or negative");
	System.out.println("case2: even or odd");
	System.out.println("case3:maximum number");
	System.out.println("enter choice");
	choice=xyz.nextInt();
	
	switch(choice)
	{
	   case 1:
	{
	   System.out.println((a<=0)?("negative"):("positive"));
	   break;
	}
	
	   case 2:
	{
	   System.out.println((a%2==0)?("even"):("odd"));
	   break;
	}
	
	   case 3:	
	{
	   System.out.println((a>=b)?("first is maximum "):("second is maximum"));
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