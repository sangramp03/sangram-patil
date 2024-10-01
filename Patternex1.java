public class Patternex1
{
  public static void main(String x[])
  {
	int i,j;
	for(i=1;i<=5;i++)
	{
	for(j=1;j<=5;j++)
	{
	if(i==3)
	{System.out.printf("* ");}
	else if(j>=3)
	{System.out.printf("* ");}
	else 
	{System.out.printf("  ");}
	}
	System.out.println();
	}
  }
}