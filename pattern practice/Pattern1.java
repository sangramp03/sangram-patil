public class Pattern1{
  public static void main(String x[]){
  
	int i,j;
	for(i=1;i<=5;i++){
	
	   for(j=1;j<=5;j++){
		
		if(i==1 || i==5 || j==1|| j==5){
		 System.out.print("* ");
		  }
		  else{
		 
		  System.out.print("  ");
		  }
	
	   }
	System.out.println("");
	}
  }
}