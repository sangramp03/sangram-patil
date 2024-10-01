import java.util.*;
   class Table{
	int no;
	Scanner xyz=new Scanner(System.in);
	void setValue(){
	System.out.println("Enter number");
	no=xyz.nextInt();
	}
		
	void showTable(){
	for(int i=1;i<=10;i++){
	System.out.println(i*no);
	    }
	}
}
	public class TableApp{
	public static void main(String x[]){
	Table c1=new Table();
	c1.setValue();
	c1.showTable();
	}
	}