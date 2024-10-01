import java.util.*;
public class OccurenceArr{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int a[]=new int[10];
	int i,j;
	System.out.println("Enter elements in array");
	
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	
	System.out.println("Enter element which find occurence");
	int num=xyz.nextInt();
	int count=0;
	
	for(i=0;i<a.length;i++){
	   if(a[i]==num){
	    count++;
	    }
	
	}
	System.out.printf("%\t ");
	System.out.printf("%\tCount");
	System.out.printf("%d\t",num);
	System.out.printf("%d\t",count);
   }
}