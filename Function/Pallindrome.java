import java.util.*;
public class Pallindrome{
	static int rem,rev=0;
	static boolean flag=false;
  public static void main(String x[]){
	Scanner xyz=new Scanner(System.in);
	System.out.println("ENTER NUMBER");
		int n=xyz.nextInt();
		shownum(n);
  }
	public static void shownum(int x){
		int temp=x;
	do{
		rem=x%10;
		x=x/10;
		rev=rev*10+rem;
	}
		while(x!=0);
	System.out.println(rev);
		
			if(temp==rev){
			flag=true;
			 }
				
				if(flag==true){
					System.out.println("NUMBER IS  PALLINDROME");
				}
				else{
				System.out.println("NUMBER IS NOT PALLINDROME");
				}
	}
}