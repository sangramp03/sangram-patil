import java.util.*;
public class AnagramArr{
     public static void main(String x[]){
            Scanner xyz=new Scanner(System.in);
	int a[]=new int[5];
	int b[]=new int[5];
	int i,j;
	int temp=0;
	System.out.println("Enter elements in first array");
	
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	
	System.out.println("Enter elements in Second array");
	
	for(i=0;i<b.length;i++){
	b[i]=xyz.nextInt();
	}
	
	
	for(i=0;i<a.length;i++){
	    for(j=i+1;j<a.length;j++){
	          if(a[i]>a[j]){
	            temp=a[i];
	           a[i]=a[j];
	           a[j]=temp;
	          }
                          }
	}
	
	
	for(i=0;i<b.length;i++){
	    for(j=i+1;j<b.length;j++){
	          if(b[i]>b[j]){
	           temp=b[i];
	           b[i]=b[j];
	           b[j]=temp;
	          }
                          }
	}
	boolean flag=true;
	for(i=0;i<a.length;i++){
	if(a[i]!=b[i]){
	flag=false;
	}
	}
	
	if(flag==true){
	System.out.println("Anagram array");
	}
	
	else{
	System.out.println("Not Anagram array");
	}
   }
}