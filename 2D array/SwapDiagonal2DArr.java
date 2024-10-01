import java.util.*;
public class SwapDiagonal2DArr{
    public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	
	System.out.println("Enter matrix size ");
	int n=xyz.nextInt();
	int i,j;
	int a[][]=new int[n][n];
	System.out.println("Enter elements ");
	
	for(i=0;i<n;i++){
	    for(j=0;j<n;j++){
	a[i][j]=xyz.nextInt();
	     }
	  }
	
	System.out.println("Matrix");
	
	for(i=0;i<n;i++){
	   for(j=0;j<n;j++){
	  System.out.printf("%d\t",a[i][j]);
	    }
	System.out.println();
	}
	int temp;
	for(i=0;i<n;i++){
	     temp=a[i][i];
	   a[i][i]=a[i][n-1-i];
	   a[i][n-1-i]=temp;
	}
	
	System.out.println("after swaping diagonal");	

	for(i=0;i<n;i++){
	   for(j=0;j<n;j++){
	  System.out.printf("%d\t",a[i][j]);
	    }
	System.out.println();
	}
	
   }
}