import java.util.*;
public class Table{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("enter number");
	int num=xyz.nextInt();
	int i,j;
	for(i=1;i<=10;i++){
	   for(j=1;j<=num;j++){
	 System.out.printf("%d\t",i*j);
	   }
	System.out.println();
	}
  }
}