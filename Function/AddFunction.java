import java.util.*;
public class AddFunction{
  public static void main(String x[]){
	
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int num1=xyz.nextInt();
	int num2=xyz.nextInt();

	showAdd(num1,num2);

  }
	public static void showAdd(int a,int b){
	
	System.out.println(a+b);
	}
}