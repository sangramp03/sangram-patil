public class pattern1{
  public static void main(String x[]){

	int i,j;
	char count='A';
	for(i=1;i<=8;i++){
	   for(j=1;j<=10;j++){
	    if(j<=6+i && j>=5-i){
		System.out.print(count++);
	      }
	    else{
    		System.out.print(" ");
		}
	 }
	System.out.println();
	}
  }
}