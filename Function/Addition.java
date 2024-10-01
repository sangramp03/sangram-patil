import java.util.*;
public class Addition{
   public static void main(String x[]){
 
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int a=xyz.nextInt();
	int b=xyz.nextInt();
	
	showAddition(a,b);
	}
	public static void showAddition(int x,int y){

 	System.out.println("Addition is\t"+(x+y));
   
   }
}