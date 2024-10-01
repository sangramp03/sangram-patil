public class patternExam{
  public static void main(String x[]){

	int i,j;
	for(i=1;i<=15;i++){
	   for(j=1;j<=8;j++){
		if(i<=8 && j<=i){System.out.print("*");}
		else if(i>8 && j<=16-i){System.out.print("*");}
		else{System.out.print(" ");}
	   }
	System.out.println();
	
	}

  }
}
