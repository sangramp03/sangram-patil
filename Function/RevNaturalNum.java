import java.util.*;
public class RevNaturalNum{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter number");
	int num=xyz.nextInt();
	show(num);
	}
	public static void show(int x){
	
	if(x !=0){
	x--;
	System.out.println(x);
	show(x);
	}
	}
}