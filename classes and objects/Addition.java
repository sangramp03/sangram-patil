import java.util.*;
class Add{
	int a,b;
	Scanner xyz=new Scanner(System.in);

	void setValue(){

	a=xyz.nextInt();
	b=xyz.nextInt();
	}
	void showAdd(){
	System.out.println("Addition is "+(a+b));
	}
}
	
	public class Addition{
	   public static void main(String x[]){
	
	
		Add ad=new Add();
		ad.setValue();
		ad.showAdd();
	   }
	}