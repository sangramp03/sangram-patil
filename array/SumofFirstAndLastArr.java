import java.util.*;
public class SumofFirstAndLastArr{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int a[]=new int[6];
	int i,j;

	System.out.println("Enter elements in array");
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
	
	int end=a.length-1;
	int start=a.length-a.length;
	int sum=0;
	for(i=0;i<a.length;i++){
 	      sum=a[end]+a[start];
	System.out.println("\nsum of index first and las is "+sum);
	}
	
	
	      
   }
}