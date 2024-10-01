import java.util.*;
public class DeleteEleArr{
    public static void main(String x[])

           Scanner xyz=new Scanner(System.in);
	
	int a[]=new int[5];
	int i,j;
	System.out.println("Enter Elements in array");

	for(i=o;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	
	System.out.println("Array before Deleting elements");

	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
	
	System.out.println("Enter Element which you want to Delete ");
	int del=xyz.nextInt();
	
	for(i=0;i<a.length;i++){
	    
	   if(a[i]==del){
	
	      for(j=i;j<a.length-1;j++){
	
	      arr[j] = arr[j+1];
	     }
                    	break;
	   }
	}
	
	System.out.println("Array after deleting Element");
	
	for(i=0;i<a.length-1;i++){
	System.out.printf("%d\t",a[i]);
	}
  }
}