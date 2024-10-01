import java.util.*;
public class MajorityArr{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int a[]=new int[10];
	int i,j;
	
	System.out.println("Enter elements in array");
	
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
	
	int mid=a.length/2;
	int count=0;
	boolean flag=false;
	
	for(i=0;i<a.length;i++){
	   
	
		if(a[i]==a[i++]){
		++count;
		
	              if(count>mid){
	                      flag=true;
	                          }
		}
	    
	}
	for(i=0;i<a.length;i++){
	if(flag==true){
	System.out.println("the majority of  "+a[i]+" is greater");
	}
	
	else{
	System.out.println("there is no majority elements in given Array");
	}
	}
	
   }
}