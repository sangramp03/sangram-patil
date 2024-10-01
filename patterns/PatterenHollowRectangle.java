public class PatterenHollowRectangle
{
  public static void main(String x[])
  {
	int i,j;
	boolean flag=true;
	//outer loop
	for(i=1;i<=4;i++){
	//inner loop
	for(j=1;j<=5; j++){
	
	if(i>=2 && i<=3 && (j==2||j==3||j==4))
	{
	System.out.printf("  ");
	
	}
	else
	{
	 System.out.printf("* ");
	
	}
	}
	 System.out.println();
      }
  }
}
	