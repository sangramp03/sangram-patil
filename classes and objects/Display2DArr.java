import java.util.*;
 class  Arr2D{

	int a[][];
	void getValues(int x[][]){
	a=x;
	}
	
	void displayArr(){
	for(int i=0;i<a.length;i++){
	    for(int j=0;j<a[i].length;j++){
	System.out.printf("%d\t",a[i][j]);
	    }
	System.out.println();
	}
	}
}
	public class Display2DArr{
	    public static void main(String x[]){
	
	        Scanner xyz=new Scanner(System.in);
	        int a[][]=new int[3][5];
	    
	       System.out.println("Enter elements");
	       for(int i=0;i<a.length;i++){
	           for(int j=0;j<a[i].length;j++){
		a[i][j]=xyz.nextInt();
	         }
	      }
	Arr2D arr2dObj = new Arr2D();
	arr2dObj.getValues(a);
	arr2dObj.displayArr();
	   }
	}