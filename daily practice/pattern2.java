public class pattern2{
  public static void main(String x[]){
 
	int i,j;
	boolean flag=true;
 	for(i=1;i<=3;i++){
	  for(j=1;j<=5;j++){
	  if(j==5 || j==1 || i==3 ||i==1 )
	{
	System.out.print("* ");
	}
	  else
	{
	  System.out.print("  ");
	}
	  }
	System.out.println();
	}
  }
}