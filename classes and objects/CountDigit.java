import java.util.*;
class Count{

	int no;
	void getValue(int x){
	no=x;
	}
	
	void showCount(){
	int count=0;
	do{
	   no=no/10;
	   count++;
	}
	while(no!=0);
	System.out.println("The count of digit is=> "+count);
	
	}
}
	public class CountDigit{
	   public static void main(String x[]){
	
	Scanner xyz=new Scanner(System.in);
	
	Count c=new Count();
	System.out.println("Enter number");
	int no=xyz.nextInt();
	
	c.getValue(no);
	c.showCount();
	   }
	}