 public class patternQue3
{                  
  public static void main(String x[])
  {
	int i,j;
	for(i=0; i<=5; i++)
	{
	for(j=0; j<=5; j++)
	{
	if(j<=i)
	{System.out.printf(" ");}
	else
	{System.out.printf("*");}
	}
	System.out.println("");
	}
  }
}