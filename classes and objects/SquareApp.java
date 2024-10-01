class Square{
	int no;
	void setValue(int x)
	{
	no=x;
	}
	void showSquare(){
	System.out.println("Square is"+no*no);
	}
}
public class SquareApp{
  public static void main(String x[]){
	Square s1=new Square();
	s1.setValue(20);
	s1.showSquare();
  
   }
}