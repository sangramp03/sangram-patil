import java.util.*;
public class PrimeLoop2
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.prinln("Enter a number");
	int num=xyz.nextInt();
	boolean flag=true;
	int i=2;

	while(i<=num/2)
	{
	if(i%num==0)
	flag=false;
	break;
	}
	i++;
	}

	if(flag)
	{System.out.println("Prime number");}	

	else
	{System.out.println(" Not a Prime number");}	
	
	}
}