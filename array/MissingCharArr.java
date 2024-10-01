import java.util.*;
public class MissingCharArr{
    public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	char a[]=new char[10];
	int i,j;
	System.out.println("Enter Characters in Array");
	
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextLine().charAt(0);
	}
	
	System.out.println("Display array characters");
	
	for(i=0;i<a.length;i++){
	System.out.printf("%c\t",a[i]);
	}
	
	System.out.println("\nAscending order");
	int temp=0;
	for(i=0;i<a.length;i++){
	   for(j=i+1;j<a.length;i++){
	         if(a[i]>a[j]){
	          int temp=a[i];
	          a[i]=a[j];
	          a[j]=temp;
	        }
	   }
	}
	
	for(i=0;i<a.length;i++){
	System.out.print(a[i]);
	}
	

	
   }
}