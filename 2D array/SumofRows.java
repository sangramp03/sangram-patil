import java.util.*;
public class SumofRows{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter size of matrix");
	int n=xyz.nextInt();
	int i,j;
	int a[][]=new int[n][n];
	System.out.println("Enter elements in array");
	
	for(i=0;i<n;i++){
	   for(j=0;j<n;j++){
	a[i][j]=xyz.nextInt();
	   }
	}
	
	for(i=0;i<n;i++){
	    for(j=0;j<n;j++){
	System.out.printf("%d\t",a[i][j]);
	    }
	System.out.println();
	}
	
	for(i=0;i<n;i++){
	    int sum=0;
	    for(j=0;j<n;j++){
	     sum=sum+a[j][i];
	     }
	System.out.println("\nsum of "+i+" row is "+sum);
	}
   }
}