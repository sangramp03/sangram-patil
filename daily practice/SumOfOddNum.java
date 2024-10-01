import java.util.*;
public class SumOfOddNum{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter number");
	int num=xyz.nextInt();
	int sum=0;

	for(int i=1;i<=num;i++){
	if(i%2!=0){
	  sum=sum+i;
	}
	}
	System.out.println(sum);
  }
}