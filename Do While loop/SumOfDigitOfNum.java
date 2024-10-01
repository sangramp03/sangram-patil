import java.util.*;
public class SumOfDigitOfNum
{
  public static void main(String x[])
  {	Scanner xyz= new Scanner(System.in);
	int num,rem,sum=0;
	System.out.println("enter num");
	num=xyz.nextInt();
	do{

	rem=num%10;
	num=num/10;
	sum+=rem;
	}
	 while(num!=0);
	System.out.println("sum of digit is"+sum);
  }
}