import java.util.*;
public class EvenNum{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter number");
	int num=xyz.nextInt();
	int i;
	for(i=1;i<=num;i++){
	  if(i%2==0){
	     System.out.printf("%d\t",i);
	  }
	}
  }
}