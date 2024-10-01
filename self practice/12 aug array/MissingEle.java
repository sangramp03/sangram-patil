import java.util.*;
public class MissingEle{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int a[]=new int[5];
	int i,temp,j;

	System.out.println("enter values");
	for(i=0;i<5;i++){
	a[i]=xyz.nextInt();
	}
	
	System.out.println("values in array");
	for(i=0;i<5;i++){
	System.out.printf("%d\t",a[i]);
	}
	
	System.out.println("\n Ascending Orders");
	
	for(i=0;i<5;i++){
	for(j=i+1;j<5;j++){
	
	if(a[i]>a[j]){
	
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
	}
	System.out.printf("%d\t",a[i]);
	}
		System.out.println("\nMissing elements");
	for(i=0;i<5;i++){
	   for(j=a[i];j<a[i+1]-1;){
		 System.out.println(++j);
	  }
	}
        
  }
}