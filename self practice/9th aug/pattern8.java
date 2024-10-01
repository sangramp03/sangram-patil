public class pattern8{
  public static void main(String x[]){


	int i ,j;

	for(i=1;i<=5;i++){
	
	  for(j=1;j<=5;j++){
	
	      if(j==1 || j==2){System.out.print("0 ");}
	
	      else if(j==3 || j==4 ||j==5){System.out.print("1 ");}
  
 	       else{System.out.print(" ");}
	  }
	System.out.println("");
	}	
  }
}