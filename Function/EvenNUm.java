public class EvenNUm{
   static int a=1;
   public static void main(String x[]){
	show(a);
	}
	public static void show(int x){
	if(x <100){
	if(x%2==0){System.out.printf("%d\t",x);}
	x++;
	show(x);
	  }
	}
}