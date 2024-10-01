public class patternexam1{
    public static void main(String x[]){

	int i,j;
	for(i=1;i<=19;i++){
	   for(j=1;j<=10;j++){
	        
	     if(i<=10 || j<=i){
	System.out.print("#");
	      }
	else if(i>10 && i<=19 || j<10-i){
	System.out.print("#");
	  }
	else{
	System.out.print(" ");
	}
	}
	System.out.println();
	}
   }
}