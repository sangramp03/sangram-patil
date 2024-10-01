public class patternex3{
  public static void main(String x[]){

    int i,j;
	
	for(i=1;i<6;i++){
	for(j=1;j<6;j++){
	 if(i==1 || i==3 || i==5){
	   if(j%2==0){System.out.print("#");}
	   else{System.out.print("*");}	    
	  }
	 else{
	  if(j%2==0){System.out.print("*");}
	   else{System.out.print("#");}	  
	  }
	}
	System.out.println();}
  }
}