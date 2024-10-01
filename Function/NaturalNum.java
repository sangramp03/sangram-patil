
public class NaturalNum{
	static int no=0;
   public static void main(String x[]){
	
   	show(no);}
	public static void show(int x){
	
	if(x<100){
		++x;
	System.out.printf("%d\t",x);
	show(x);	
	}
	
	
	}

	
   
 }