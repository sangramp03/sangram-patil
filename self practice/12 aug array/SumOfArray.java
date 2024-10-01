import java.util.*;
public class SumOfArray{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
       
	int a[]=new int[5];
	for(int i=0;i<5;i++){
	 a[i]=xyz.nextInt();
	
	}
	
	for(int i=0;i<5;i++){
	System.out.print(a[i]);
	}
	 System.out.println();
	int sum=0;
	for(int i=0;i<5;i++){
	sum=sum+a[i];
	
	}
       System.out.println("Sum of array"+sum);
  }
}