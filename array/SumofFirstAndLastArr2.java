import java.util.*;
public class SumofFirstAndLastArr2{
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
	int mid=a.length/2;
	int sum=0;
	
	for(i=0;i<=mid;i++){
	   for(j=mid+1;j<=end;j++){
	    sum=a[i]+a[j];
	
	System.out.println("sum of  "+a[i]+"  and  "+a[j]+"  is  "+sum);
	   }
	}   
   }
}