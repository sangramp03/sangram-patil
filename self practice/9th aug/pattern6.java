public class pattern6{
  public static void main(String x[]){

 	int i,j;
	
	for(i=1;i<=6;i++){
	    for(j=1;j<=3;j++){
	   	if(i>=1&& i<=3 && j<=i){System.out.print("*");}
		else if(i>3 && j<=i-3){System.out.print("*");}
		else{System.out.print(" ");}
	    }
	System.out.println("");
	}	
  }
}