import java.util.*;
   class Fact{
  	int no;
	Scanner xyz=new Scanner(System.in);
	
	void setValue(){
	System.out.println("enter number");
	 no=xyz.nextInt();
	}
	
	void showFact(){
	int f=1;
	for(int i=1;i<=no;i++){
	f=f*i;
	}
	System.out.println("Factorial of "+no+" is "+f);
	}
}
	public class Factorial{
	public static void main(String x[]){
	
	      Fact c1=new Fact();
	      c1.setValue();
	       c1.showFact();
	}
	}