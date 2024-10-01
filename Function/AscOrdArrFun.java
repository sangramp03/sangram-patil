import java.util.*;
public class AscOrdArrFun{
	static int i,j,temp=0;
  public static void main(String x[]){
  
  Scanner xyz=new Scanner(System.in);
  System.out.println("Enter elements");
	int a[]=new int[5];
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	showAsc(a);
	}
     public static void showAsc(int x[]){	
	for(i=0;i<5;i++){
	  System.out.printf("%d\t",x[i]);
	}
		
		for(i=0;i<5;i++){
			for(j=i;j<5;j++){
				if(x[i]>x[j]){
				temp=x[i];
				x[i]=x[j];
				x[j]=temp;
				}
			}
		}
		
		System.out.println("\nAscending order ");
		for(i=0;i<5;i++){
			System.out.println(x[i]);
        }
}
}