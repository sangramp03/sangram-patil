public class PatternExam2{
  public static void main(String x[]){
	
	int i,j;
	char count='A';
	for(i=1;i<=5;i++)
         {
	  for(j=1;j<=10;j++)
             {
		if(j<=i)
                 {
		   System.out.print(count++);
		 }
	   else if(j>=11-i)
                {
		System.out.print(--count);
		}
	     else
                {
		System.out.print(" ");
		}
	  }
	System.out.println();
	}
  }
}