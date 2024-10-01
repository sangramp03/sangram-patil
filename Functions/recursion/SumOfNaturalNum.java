import java.util.*;
public class SumOfNaturalNum{
	static int sum=0;
	
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter number");
	 int num=xyz.nextInt();
	show(num);
	}
	
  public static void show(int x){
	
	if(x>=1){
	sum++;
	sum=sum+x;
		}
	System.out.println(sum);
	show(x);

	}
}