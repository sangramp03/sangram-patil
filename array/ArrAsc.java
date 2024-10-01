import java.util.*;
public class ArrAsc{
  public static void main(String x[]){
	
	Scanner xyz=new Scanner(System.in);
	int a[]=new int[5];
	int temp,i,j;

	System.out.println("Enter elements in Array");

	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}

	System.out.println("Display array");

	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
	
	for(i=0;i<a.length;i++){
	    for(j=i+1;j<a.length;j++){
	
		if(a[i]>a[j]){
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
	   }

	}
	System.out.println("\nAscending Array\n");
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}

  }
}