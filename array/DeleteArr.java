import java.util.*;
public class DeleteArr{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int a[]=new int[5];
	int i,j;
	
	System.out.println("Enter Elements in Array");
	
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	
	System.out.println("Array before Deleting Element");
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
	
	System.out.println("\nEnter index which you want to delete element in above array");
	int index=xyz.nextInt();	

	for(i=0;i<a.length;i++){
	   for(j=i;j<a.length-1;j++){
	      if(a[i]==a[index]){
	              a[i]=a[i+1];
	              int temp=a[i];
	             a[i]=a[j];
	            a[j]=temp;
		
	      }
	   }
	}
	System.out.println("Array After delete element");
	for(i=0;i<a.length-1;i++){
	System.out.printf("%d\t",a[i]);
	}
	
	
   }
}