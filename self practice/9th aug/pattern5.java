public class pattern5{
  public static void main(String x[]){

  
 	int i,j,count=1;
	char ch=65;
	for(i=1;i<=5;i++)
     {
	  for(j=1;j<=5;j++)
       {
	    if(i%2==0)
            {
	      if(j<=i) {System.out.print(ch);
			ch++;
             }
	
	}
	else {
	
	if(j<=i){System.out.print(count);
	count++;}}
	}
	System.out.println();
     }
  }
}