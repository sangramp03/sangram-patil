import java.util.*;
public class AcendingArray{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int a[]=new int[5];
	for(int i=0;i<5;i++){
	 a[i]=xyz.nextInt();
	}
	System.out.println("unsorted array");
	for(int i=0;i<5;i++){
	System.out.print(a[i]+" ");
	}
	

	System.out.println();
	

	for(int i=0;i<5;i++){
	for(int j=i+1;j<5;j++){
	if(a[i]>a[j]){
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	 }
	}
	}System.out.println("ascending order");
		for(int i=0;i<5;i++){
		System.out.print(a[i]+" ");
	}

	
  }
}