public class patternExam{
   public static void main(String x[]){
   
	int i,j;
	boolean flag=true;
	for(i=1;i<=4;i++){
	   for(j=1;j<=i;++j){
		System.out.print(j);
		if(j<i){
                     System.out.print("*");}
		   
		}
	   
	System.out.println();
	}
	for(i=1;i<=4;i++){
             int count=5-i;
	  for(j=4;j>=i;j--){
            
	System.out.print(count--);
		if(j>i){
                     System.out.print("*");}
		   
	}
		System.out.println();
	}

   }
}