import java.util.*;
public class SecondLargestEle{
   public static void  main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int a[]=new int[5];
	int i,j;
	System.out.println("Enter elements in array");
	
	
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	
	    int temp=0;
	for(i=0;i<a.length;i++){
	   for(j=i+1;j<a.length;j++){
	             if(a[i]>a[j]){
	                temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	              }
	   }
	}
	   int max=a[0];
	for(i=0;i<a.length;i++){
	     if(a[i]>max){
	         max=a[i-1];
	    }
	}
	
	System.out.println("Second largest element is"+max);
	
	int min=a[0];
	for(i=0;i<a.length;i++){
	     if(a[i]<min){
	         min=a[1];
	    }
	}
	
	System.out.println("Second smallest element is"+min);
   }
}