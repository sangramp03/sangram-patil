public class PatterenHollowRectangle2
{
  public static void main(String x[])
  {
	int i,j;
	boolean flag=true;
	//outer loop
	for(i=1;i<=5;i++){
	//inner loop
	for(j=1;j<=5; j++){
	
	if(i==1 || i==5|| j==1 ||j==5)
	{
	System.out.printf("* ");
	
	}
	else
	{
	 System.out.printf("  ");
	
	}
	}
	 System.out.println();
      }
  }
}