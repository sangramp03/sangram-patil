import java.util.*;
public class SecondLargest{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int a[]=new int[5];
	int i,j;
	System.out.println("Enter elements in array");
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	
	for(i=0;i<a.length;i++){
	    for(j=i+1;j<a.length;j++){
	         if(a[i]<a[j]){
	        int temp=a[i];
	         a[i]=a[j];
	          a[j]=temp;
	         }
	    }
	}
	
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
	
	int smax=0;
	for(i=0;i<a.length;i++){
	     if(a[i]>smax){
	     smax=a[1];
	            if(a[i]==a[i+1]){
	             smax=a[2];
                              }
	             else{
	             smax=a[i+1];
	            }
	        
	     }
	    
	}
	System.out.println("\nSecond maximum element is\n"+smax);
	
	
   }
}