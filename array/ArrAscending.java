import java.util.*;
public class ArrAscending{
  public static void main(String x[]){
  
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter elements in Array");
	int a[]=new int[5];
	int i,j;
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	
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
	System.out.println("\nAscending Order");
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
  
  }
}