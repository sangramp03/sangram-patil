import java.util.*;
public class EvenOddArr2{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("Enter elements in array");
	int i,j;
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	
	System.out.println("\nDisplay array");
	
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
	
	System.out.println("\nEven digits in array");
	
	for(i=0;i<a.length;i++){
	if(a[i]%2==0)
	System.out.printf("%d\t",a[i]);
	}
	
	System.out.println("\nodd digits in array");
	
	for(i=0;i<a.length;i++){
	if(a[i]%2!=0)
	System.out.printf("%d\t",a[i]);
	}
   }
}