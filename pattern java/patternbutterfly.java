public class patternbutterfly{
  public static void main(String x[]){
  
      int i,j;
	for(i=1;i<9;i++){
	  for(j=1;j<9;j++){
	   if(i<5){
		if(i>=j || j>=9-i){System.out.print("*");}
		else{System.out.print(" ");}
		}
	else if(i>=5){
	if(j<=9-i && j>=9-i){System.out.print("*");}
	else{System.out.print(" ");}
		}
	    }
	System.out.println();
	}
  }
} 