import java.util.*;
public class SumOfEvenNum{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter number");
	int n=xyz.nextInt();
	int sum=0;
	for(int i=0;i<=n;i++){
	if(i%2==0){
	sum=sum+i;
	}
	}
	System.out.println(sum);
  }
}