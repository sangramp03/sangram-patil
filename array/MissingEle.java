
import java.util.*;
public class MissingEle{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int a[]=new int[5];
	int i,j;
	System.out.println("Enter elements in array");
	
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	System.out.println("Display Array\n");
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
	
	for(i=0;i<a.length;i++){
	  for(j=i;j<a.length;j++){
	       if(a[i]>a[j]){
	        int temp=a[i];
	        a[i]=a[j];
	        a[j]=temp;
		}
	  }
	}
	System.out.println("\nAscending order");
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}

	System.out.println("\nMissing Elements");
	for(i=0;i<a.length-1;i++){
	   for(j=a[i]+1;j<a[i+1];j++){
	System.out.printf("%d\t",j);
	   }
	}
   }
}