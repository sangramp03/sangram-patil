import java.util.*;
  public class OddNum{
    public static void main(String x[]){
    
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter number");
	int n=xyz.nextInt();
	
	/*int i=0;
	while(i<=n){
	if(i%2!=0){
	System.out.println(i);
	}
	i++;
	} */
	
	for(int i=0;i<=n;i++){
	if(i%2!=0){
	System.out.println(i);
	}
	}
   }

}