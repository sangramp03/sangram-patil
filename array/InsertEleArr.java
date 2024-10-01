import java.util.*;
public class InsertEleArr{
  public static void main(String x[]){
  
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter Elements");
	int a[]=new int[5];
	
		for(int i=0;i<a.length;i++){
		a[i]=xyz.nextInt();
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);	
			}
			
	System.out.println("Enter index");
	int index=xyz.nextInt();
	
	System.out.println("Enter value");
	int value=xyz.nextInt();
	
	for(int i=0;i<5;i++){
	    for(int j=0;j<6;j++){
		  a[i]=a[j];
		  a[j]=a[index+1];
		  a[index]=value;
		  System.out.printf("%d\t",a[i]);
		}
		
	}
	
	}
}