import java.util.*;
public class SmmallestMissingNoArr{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int a[]=new int[5];
	int i,j;
	System.out.println("Enter Elements in array");
	
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	
	System.out.println("\n Display array elements");
	
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
	System.out.println("\nAscending Array");
	int temp=0;
	for(i=0;i<a.length;i++){
	     for(j=i+1;j<a.length;j++){
		if(a[i]>a[j])
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	    }
	}
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
	
	System.out.println("\n Display missing elements");
		int min=0;
	for(i=0;i<a.length-1;i++){
	     for(j=a[i]+1;j<a[i+1];j++){
	    }
	}
	
	for(i=0;i<a.length;i++){
	  if(a[i]>j){
	        System.out.printf("%d\t",j);
	                    }
	}
	
   }
}