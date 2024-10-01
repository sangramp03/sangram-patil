import java.util.*;
public class Power{
  public static void main(String x[])
    {

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter base");
	int base=xyz.nextInt();
	System.out.println("Enter index");
	int index=xyz.nextInt();
	showPower(base,index);
     }
	
   public static void showPower(int x, int y){
  	int p=1;
	for(int i=0;i<=y;i++){
	  p*=x;
	}
	System.out.println("power is "+p);
  }
}