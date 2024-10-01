import java.util.*;
public class MissisngEleArr{
  public static void main(String x[]){
  
  Scanner xyz=new Scanner(System.in);
  System.out.println("Enter elements");
  int a[]=new int[5];
  int i,j;
  
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	System.out.println("Display array\n");
	
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
	
	
	
	for(i=0;i<a.length;i++){
	  for(j=i+1;j<a.length;j++){
			if(a[i]>a[j]){
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
	  }
	}
	System.out.println("\nSorted Array\n");	
	
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
	
		System.out.println("\n Missing Elements In Array\n");	
		for(i=0;i<a.length-1;i++){
			for(j=a[i]+1;j<a[i+1];j++){
				System.out.printf("%d\t",j);
			}
		}
  }
}