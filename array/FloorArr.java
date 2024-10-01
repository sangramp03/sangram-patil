import java.util.*;
public class FloorArr{
   public static void main(String x[]){

           Scanner xyz=new Scanner(System.in);
          int a[]=new int[8];
	int i,j;
              System.out.println("Enter elements in array");
	
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	int temp=0,floor=-1;
	for(i=0;i<a.length;i++){
	    for(j=i+1;j<a.length;j++){
	       if(a[i]>a[j]){
	          temp=a[i];
	          a[i]=a[j];
	            a[j]=temp;
	       }
	   }
	}
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t \n",a[i]);
	}
	
	for(int n=1;n<=10;n++){
	
	for(i=0;i<a.length;i++){
	
	     if(a[0]>n){
	       floor=-1;
	       break;
	     }
	
	    else if(a[a.length-1]<n){
	       floor=a[a.length-1];
	        break;
	    }
	   
	     else if(a[i]<n && a[i+1]>n){
	         floor=a[i];
	          break;
	        }
	     else if(a[i]==n){
	         floor=a[i];
	         break;
	        }
	}
	System.out.println("floor of"+n+" is  "+floor);
	}
	
    }
}