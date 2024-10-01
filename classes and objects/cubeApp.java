class Cube{
	int no;
	void setValue(int x)
	{
	no=x;
	}
	void showValue(){
	System.out.println("Cube is"+(no*no*no));
	}
}
public class CubeApp{
  public static void main(String x[]){
       Cube c=new Cube();
	c.setValue(5);
	c.showValue();
  }
}