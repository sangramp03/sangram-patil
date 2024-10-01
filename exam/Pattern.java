public class Pattern{
  public static void main(String x[]){

	int i,j;
	 
	for(i=1;i<=10;i++){                 //no of rows
	  for(j=1;j<=10;j++){              //no of columns
	    if(j>=11-i){                  //condition 
		System.out.print("#");}  //print output
	    else{
	        System.out.print(" ");}  //space
	    
	  }
	System.out.println();  //line break
	}
	
	for(i=1;i<=10;i++){                  //no of rows
	  for(j=1;j<=10;j++){               //no of columns
	    if(j<=i){                  //condition 
		System.out.print(" ");}  //print output
	    else{
	        System.out.print("#");}
	    
	  }
	System.out.println();  //line break
	}
  }
}