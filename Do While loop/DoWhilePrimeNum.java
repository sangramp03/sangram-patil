import java.util.*;
public class DoWhilePrimeNum
{
  public static void main(String x[])
  {
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter number");
	int num=xyz.nextInt();
	int sum=0;
	int i=1;

	do
	{	
	sum +=i;
	i++;
	}
	
	while(i<=num);
	
	System.out.println("sum of natural numbers is"+sum);
	
	
  }
}