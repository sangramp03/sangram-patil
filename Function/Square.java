import java.util.*;
public class Square{
  public static void main(String x[]){
  
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter number");
    int num=xyz.nextInt();
	showSquare(num);
   }
	public static void showSquare(int x){
 
   System.out.println("square is\t"+(x*x));
    }
}