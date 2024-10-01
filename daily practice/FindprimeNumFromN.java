import java.util.*;
public class FindprimeNumFromN{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter NUmber ");
	int n=xyz.nextInt();
	
	int i,j;
	
	for(i=1;i<=n;i++){
		int count=0;
	  for(j=1;j<=i;j++){
		if(i%j==0){
		count++;
		}
		}
	if(count==2){
	  System.out.println(i);
	}
	}
  }
}