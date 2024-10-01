import java.util.*;
public class RemMonkey{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter total number of Monkeys");
	int n=xyz.nextInt();
	
	System.out.println("Enter total number of Bananas");
	int m=xyz.nextInt();
	System.out.println("Enter total number of peanuts");
	int p=xyz.nextInt();
	System.out.println("Enter number of bananas eaten by oneMonkey");
	int k=xyz.nextInt();
	System.out.println("Enter t number of penutes eaten by oneMonkey");
	int j=xyz.nextInt();
	
	getRemMonkeys(n,m,p,k,j);
	}
	public static void getRemMonkeys(int n,int m,int p, int k,int j){

	int monkeeatbanana=m/k;
	int monkeyeatpeanutes=p/j;
	
	int total=monkeeatbanana+monkeyeatpeanutes;
	
	int remmonkeys=n-total;
	System.out.println("Remaining monkeys= "+remmonkeys);
               }
   
}