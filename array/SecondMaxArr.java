import java.util.*;
public class SecondMaxArr{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	
	int a[]=new int[6];
	int i,j;
	
	System.out.println("Enter elements");
	
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	int temp,count=1;
	for(i=0;i<a.length;i++){
	   for(j=i+1;j<a.length;j++){
	       if(a[i]<a[j]){
	       temp=a[i];
	      a[i]=a[j];
	      a[j]=temp;
	       }
	   }
	}
	
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
	 int smax=0;
	boolean flag=true;
	for(i=0;i<a.length;i++){
	if(a[i]>smax){
	smax=a[i+1];
	     if(a[i]==a[i+1]){
	     count++;
	      }
	   if(count==2){
	      flag=false;
	    }
	  else{
	    flag=true;
	    }
	}  
	}
	if(flag==true){
	System.out.println("Second max element is"+a[i]);
	}
   }
}