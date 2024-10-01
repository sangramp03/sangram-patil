import java.util.*;
public class PhoneArr{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter elements in array");
	int a[]=new int[10];
	int i;
	
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();	
	}
	
	for(i=0;i<a.length;i++){
	  if(a[i]<=a[2] && a[i]>=a[6]){
	     System.out.print("*");
	   }
	  else if(a[i]>=a[3] && a[i]<=a[5]){
		System.out.printf("%d\t",a[i]);
	    }
	}
  }
}