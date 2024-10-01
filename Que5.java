import java.util.*;
public class Que5
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter num ");
	int num=xyz.nextInt();
	int sq=0;
	int rem;
	int rev;
	int sum=0;
	
	
	
	sq=num*num;
	rem=sq%10;
	rev=sq/10;
	sum=rem+rev;
	
	if(sum==num)
	 {System.out.println("number is neon ");}
	
	else
	{System.out.println("number is not neon");}
	
     }
}