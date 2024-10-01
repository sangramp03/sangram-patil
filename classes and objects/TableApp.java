import java.util.*;
class Table{

	Scanner xyz=new Scanner(System.in);
	int no;
	
	void enterValue(){
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
	
		Table t=new Table();
		t.enterValue();
		t.showTable();
	   }
	}