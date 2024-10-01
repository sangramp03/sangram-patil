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
	int suml=0,sumr=0;
	void findSumofDiagonal(){
	for(int i=0;i<a.length;i++){
	    for(int j=0;j<a[i].length;j++){
	if(i==j){
	     suml=suml+a[i][j];
	     }
	if(i+j==a.length-1){
	     sumr=sumr+a[i][j];
	     }
	    }
	
	}
	System.out.println("sum of left Diagonal in matrix is=> "+suml);
	System.out.println("sum of Right Diagonal in matrix is=> "+sumr);
	}

       
}
	public class SumofDiagonal2DArr{
	    public static void main(String x[]){
	
	        Scanner xyz=new Scanner(System.in);
	        int a[][]=new int[5][5];
	    
	       System.out.println("Enter elements");
	       for(int i=0;i<a.length;i++){
	           for(int j=0;j<a[i].length;j++){
		a[i][j]=xyz.nextInt();
	         }
	      }
	Arr2D arr2dObj = new Arr2D();
	arr2dObj.getValues(a);
	arr2dObj.displayArr();
	arr2dObj.findSumofDiagonal();
	   }
	}