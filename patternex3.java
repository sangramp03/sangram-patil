public class patternex3
{
  public static void main(String x[])
  {
  	int i,j,k;
	for(i=1;i<=5; i++)
	{
	for(j=1; j<=5; j++)
	{
	for(k=5; k>=i; k--)
	{
	if(j==2 && i==2)
	{System.out.printf(" ");}
	else if(j==4 && i==2 && i==3)
	{System.out.printf(" ");}
	else
	{System.out.printf("*");}
	}
	}
	System.out.println("");
	}
  }
}