import java.util.*;
public class AscendingArray{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int i;
	int a[]=new int[5];
	for(i=0;i<5;i++){
	a[i]=xyz.nextInt();
	}
	System.out.println("Array before ascendig order");
	for(i=0;i<5;i++){
	
	System.out.print(a[i]);
	}
	System.out.println("Array after ascendig order");
	
	for(i=0;i<5;i++){
	
          if(a[i]>=a[i+1]){System.out.println(a[i]);}
	
	}
	

  }
}