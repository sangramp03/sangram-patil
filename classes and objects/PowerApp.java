import java.util.*;
class Power{
	int base,index;
	Scanner xyz=new Scanner(System.in);
	
	void setValue(){
	System.out.println("Enter base ");
	base=xyz.nextInt();
	System.out.println("Enter index");
	index=xyz.nextInt();
	}
	
	void showPower(){
	int p=1;
	for(int i=1;i<=index;i++){
	p=p*base;
	}
	System.out.println("power "+base+" is"+p);
	}
}
	
	public class PowerApp{
	public static void main(String x[]){

	Power c1=new Power();
	c1.setValue();
	c1.showPower();
	}
	}