import java.util.*;
public class MergeAsceArr2{
   public static void main(String x[]){

       Scanner xyz=new Scanner(System.in);
          int a[]=new int[5];
          int b[]=new int[5];
            System.out.println("Enter elements in first array");
               
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}

	for(i=0;i<a.length;i++){
	System.ouy.println("\nDisplay first array")
	}

             System.out.println("Enter elements in second array");
               
	for(i=0;i<b.length;i++){
	b[i]=xyz.nextInt();
	}
	
	  System.out.println("\nDisplay second array");
	for(i=0;i<b.length;i++){
	System.out.printf("%d\n",b[i]);
	}

	int c[]=new int[a.length+b.length];
	int index=0;

	System.out.println("Merged Array");	
	
	for(i=0;i<a.length;i++){
	c[index++]=a[i];
	}
	
	for(i=0;i<b.length;i++){
	c[index++]=b[i];
	}
	
	for(i=0;i<c.length;i++){
	System.out.printf("%d\t",c[i]);
	}
	
	System.out.println("\nAscending Array");
	
	for(i=0;i<c.length;i++){
	    for(j=i+1;j<a.length;j++){
		if(c[i]>c[j]){
		int temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		}
	   }
	}
	
	for(i=0;i<c.length;i++){
	System.out.printf("%d\t",c[i]);
	}
  }
}
