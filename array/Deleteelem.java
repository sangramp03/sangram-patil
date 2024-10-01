import java.util.*;
public class Deleteelem{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int a[]=new int[5];
	int i;

	System.out.println("Enter elements in array");
	
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
	
	System.out.println("\nEnter index where you want to Delete Element");

	int index=xyz.nextInt();
	
	for(i=index;i<a.length;i++){
	a[i]=a[i+1];
	}
	
	   a[a.length - 1] = 0;

	System.out.println("\nFinal array elements after deletion");
	
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
  }
}