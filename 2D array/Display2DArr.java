import java.util.*;
public class Display2DArr{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int a[][]=new int[3][3];
	
	System.out.println("Enter elements in array");
	
	for(int i=0;i<a.length;i++){
	     for(int j=0;j<a[i].length;j++){
	              a[i][j]=xyz.nextInt();
	     }
	}
	
	for(int i=0;i<a.length;i++){
	    for(int j=0;j<a[i].length;j++){
	System.out.printf("%d\t",a[i][j]);
	    }
	System.out.println();
	}

	int max[]=new int[a.length];
	for(int i=0;i<a.length;i++){
	         int sum=0,max1=0;
	      for(int j=0;j<a[i].length;j++){
	            sum=sum+a[i][j];
	            if(max1< sum){
	                  max1=sum;
	 
	        }
	         
	     }
	System.out.println("sum of a  is "+max1);
	}
	      
	
	
	
   }
}