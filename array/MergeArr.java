import java.util.*;
public class MergeArr{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int a[]=new int[5];
	int b[]=new int[5];
	int c[]=new int[a.length+b.length];
	int i;
		
	System.out.println("Enter first array Elements");
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	
	System.out.println("Enter second array Elements");
	for(i=0;i<b.length;i++){
	b[i]=xyz.nextInt();
	}
	
	System.out.printf("\nDisplay first array elements\n");
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
	
	System.out.println("\nDisplay Second array elements");
	for(i=0;i<b.length;i++){
	System.out.printf("%d\t",b[i]);
	}
	int index=0;
	for(i=0;i<a.length;i++){
	c[index++]=a[i];
	}

	for(i=0;i<b.length;i++){
	c[index++]=b[i];
	}
	
	
	System.out.println("\nDisplay merge array elements");
	for(i=0;i<c.length;i++){
	System.out.printf("%d\t",c[i]);
	}
	
   }
}