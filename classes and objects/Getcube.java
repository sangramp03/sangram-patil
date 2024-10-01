import java.util.*;
class Cube{

	Scanner xyz=new Scanner(System.in);
	int no;	
	void setValue(){
	no=xyz.nextInt();
	}
	
	void getCube(){
	System.out.println("cube is"+no*no*no);
	}
}
	
	public class Getcube{
	   public static void main(String x[]){
	
		Cube c=new Cube();
		c.setValue();
		c.getCube();
	   }
	}