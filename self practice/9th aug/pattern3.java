public class pattern3{
  public static void main(String x[]){

	int i,j;
	for(i=1;i<=5;i++){
		int ch=64+i;
	   for(j=1;j<=5;j++){
		if(j<=i){
	     	System.out.printf("%c",ch);
			ch++;}
		
	   }
	System.out.println("");
	}
  }
}