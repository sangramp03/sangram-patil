public class PatternQue9
{
  public static void main(String x[])
  {
        int i,j;
	
	for(i=1; i<=4; i++)
  {
	for(j=1; j<=9; j++)
   {
	if(j<=4+i && j>  =6-i)
	{System.out.printf("*");}
	
	
	else
	{System.out.printf(" ");}
    }	
	System.out.println("");
  }
  }
}