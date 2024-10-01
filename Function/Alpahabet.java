
public class Alpahabet{
	static int a=64;
  public static void main(String x[]){
	
	show(a);
	}
	public static void show(int x){
	
		if(x<=89){
		x++;
		System.out.printf("%c\t",x);
		show(x);
		}
	}
}