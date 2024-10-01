import java.util.*;
public class DisplayArr{
  public static void main(String x[]){
  
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter elements in Array");
	int a[]=new int[5];
	int i;
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	System.out.println("Display Array");
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
	
  }
}