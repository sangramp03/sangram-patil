import java.util.*;
public class SumOfRow2D{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter size of matrix");
	int n=xyz.nextInt();
	int a[][]=new int[n][n];
	int i,j;
	System.out.println("Enter elements");
	
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
		
	         sum=sum+a[i][j];
	    }
	System.out.println("sum of "+(i+1)+" is"+sum);
	}
   }
}