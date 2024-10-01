import java.util.*;
public class MatrixJaggedArr{
  public static void main(String x[]){
  
	Scanner xyz=new Scanner(System.in);
	int a[][]=new int[5][];
	a[0]=new int[9];
	a[1]=new int[5];
	a[2]=new int[2];
	a[3]=new int[6];
	a[4]=new int[3];
	System.out.println("Enter Elements in Array");
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a.length;j++){
		
		a[i][j]=xyz.nextInt();
		}
		}
		System.out.println("Display the MAtrix");
		
		for(int i=0;i<a.length;i++){
		   for(int j=0;j< a[i].length;j++){
		   System.out.printf("%d\t",a[i][j]);
		   }
		   System.out.println();
		}
	
  }
}