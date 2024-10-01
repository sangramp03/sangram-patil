import java.util.*;
public class SpecifiedPosition{
   public static void main(String x[]){


	Scanner xyz=new Scanner(System.in);
	int a[]=new int[6];
	int i,index,value;
	System.out.println("enter values");
	for(i=0;i<5;i++){
	a[i]=xyz.nextInt();
	}
	
	for(i=0;i<5;i++){
	System.out.printf("%d\t",a[i]);
	}
	System.out.println("");
	System.out.println("enter index");
	index=xyz.nextInt();
	System.out.println("enter value");
	value=xyz.nextInt();
	System.out.println("Specified value");
	
	for(i=5;i<index;i--){
	a[i]=a[i-1];
	}
	
	a[index]=value;
	
	for(i=0;i<6;i++){
	System.out.printf("%d\t",a[i]);
	}
	
	
   }
}