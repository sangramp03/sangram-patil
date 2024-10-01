import java.util.*;
class Rectangle{

	
	int l,b;
	void getValues(int x,int y){
	l=x;
	b=y;
	}
	
	void showArea(){
	System.out.println("Area of rectangle is "+(l*b));
	}
}
	public class RectArea{
	    public static void main(String x[]){
	
	Scanner xyz=new Scanner(System.in);
	
	     Rectangle recta=new Rectangle();
	System.out.println("Enter length");
	int  l=xyz.nextInt();
	System.out.println("Enter breadth");
	int b=xyz.nextInt();
	      recta.getValues(l,b);
	      recta.showArea();
	   }
	}