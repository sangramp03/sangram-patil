
public class SumOfEven
{
  public static void main(String xp[])
  {
	int i=2,sum=0;
	do{
	sum+=i;
	i+=2;
	}
	while(i<=100);
	
	System.out.println("sum of even numbers is"+sum);
  }
}