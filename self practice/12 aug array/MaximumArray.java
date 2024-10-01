import java.util.*;
public class MaximumArray{
   public static void main(String x[]){
	
	Scanner xyz=new Scanner(System.in);   

	int a[]=new int[5];
	for(int i=0;i<5;i++){
	 a[i]=xyz.nextInt();
	}
	int max=a[0];
	for(int i=0;i<5;i++){
	
	if(max<a[i]){
	  max=a[i];
	 }
	
	}System.out.println("maximum value is"+max);
	
	int min=a[0];
	
	for(int i=0;i<5;i++){
	if(min>a[i]){
	min=a[i];
	  }
	}System.out.println("minimum value is"+min);
   }
}