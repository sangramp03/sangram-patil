class Table{
 int no;
 void inputValue(int x)
  {
  no=x;
   }
	void showValue(){
	for(int i=1;i<=10;i++){
	System.out.println(no*i);
         }
    }
}
public class TableApp2{
  public static void main(String x[]){
   
    Table t=new Table();
    t.inputValue(8);
    t.showValue();
  }
}