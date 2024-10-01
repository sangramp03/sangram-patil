import java.util.*;
 public class TotalAndPercentage{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int a[]=new int[6];
	int total=0,i;
	System.out.println("Enter Marks Of 6 Subjects");
	
	for(i=0;i<a.length;i++){
	  a[i]=xyz.nextInt();
	}
	
	   int per=0;
	for(i=0;i<a.length;i++){
	  total=total+a[i];
	  per=total/6;
	}
	System.out.println("Total marks "+total);
	System.out.println("Precentage is "+ per);
	
   }
}