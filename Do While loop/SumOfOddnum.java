public class SumOfOddnum
{
  public static void main(String x[])
  {
	int i=1,sum=0;
	do{

	sum+=i;
	i+=2;
	}
	while(i<=100);
	System.out.println("sum of odd natural number is"+sum);
  }
}