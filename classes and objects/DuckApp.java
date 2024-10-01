import java.util.*;
class Duck{
	int no;
	Scanner xyz=new Scanner(System.in);
	
	void setValue(){
	System.out.println("Enter number");
	no=xyz.nextInt();
	}
	
	void showDuck(){
	  int rem;
	boolean flag=false;
	
	do{
	rem=no%10;
	no=no/10;
	
	   if(rem==0){
	 flag=true;
	  break;
	     }
	}
	while(no!=0);
	    if(flag==true){
	System.out.println("it is a duck number");
	     }
	else{
	System.out.println("it is not duck number");
	}
	}
}
	public class DuckApp{
	public static void main(String x[]){
	
	       Duck c1=new Duck();
	       c1.setValue();
	       c1.showDuck();
	}
	}