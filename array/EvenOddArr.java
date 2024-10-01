import java.util.*;
public class EvenOddArr{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	
	int a[]=new int[5];
	int i;
         	
        System.out.println("Enter Elements in array");
	for(i=0;i<a.length;i++)
	{
	 a[i]=xyz.nextInt();
	}
	System.out.println("Even values");
	for(i=0;i<a.length;i++){
	  if(a[i]%2==0){
	System.out.printf("%d\t",a[i]);
	  }
	}
	System.out.println("\nOdd values");
	for(i=0;i<a.length;i++){
	  if(a[i]%2!=0){
	   System.out.printf("%d\t",a[i]);
	  }
	}
  }
}