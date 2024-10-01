class Prime{
 int no;
  void setValue(int x)
  {
  no=x;
  }
   void showValue(){
      if(no%2==0){System.out.println("not a prime number");}
      else{System.out.println("it is a prime number");}
   }
}
public class PrimeApp{
  public static void main(String x[]){
    Prime p=new Prime();
     p.setValue(5);
     p.showValue();
  }
}