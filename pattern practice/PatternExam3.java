public class PatternExam3{
  public static void main(String x[]){

	int i,j;
	for(i=1;i<=4;i++){
	  for(j=1;j<=4;j++){
		if(j<=i){
		System.out.print(j);
		System.out.print("*");
		}
	  }
	System.out.println();
	}
	for(i=1;i<=4;i++){
	 int count=5-i;
	  for(j=4;j>=i;j--){
		
		System.out.print(count--);
		System.out.print("*");
		}
	System.out.println();
	}
  }
}