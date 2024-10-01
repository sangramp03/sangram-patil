import java.util.*;
class Add{

	void setValue(){
	Scanner xyz=new Scanner(System.in);
	int a=xyz.nextInt();
	int b=xyz.nextInt();
	}
 	
	void getValue(){
	System.out.println("Addition is "+(a+b));
	}
}
	
	public class Addition{
	   public static void main(String x[]){
	
		Add ad=new Add();
		ad.setValue();
		ad.getValue();
	   }
	}