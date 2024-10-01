public class patternex{
  public static void main(String x[]){

    int i,j;
	
	for(i=1;i<6;i++){
	for(j=1;j<6;j++){
	  if(j<=6-i){System.out.print("*");}
	  else{System.out.print(" ");}
	}
	System.out.println();}
  }
}