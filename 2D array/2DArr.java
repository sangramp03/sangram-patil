import java.util.*;
public class Display2DArr{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int a[][]=new int[3][3];
	
	System.out.println("Enter elements in array");
	
	for(int i=0;i<a.length;i++){
	     for(int j=0;j<a[a.length];i++){
	 a[i]=xyz.nextInt();
	     }
	}
	
	for(int i=0;i<a.length;i++){
	    for(int j=0;j<a[a.length];i++){
	System.out.printf("%d\t",a[i][j]);
	    }
	}
   }
}