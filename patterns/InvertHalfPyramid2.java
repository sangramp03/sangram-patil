public class InvertHalfPyramid2
{
  public static void main(String x[])
  {
  	int i,j;
	for(i=1; i<=6; i++)
	{
	for(j=1; j<=6-i; j++)
	{
	System.out.printf(" ");
	}
	for(j=1;j<=i;j++)
	{
	System.out.printf("*");
	}
	System.out.println();
	}
	
  }
}   