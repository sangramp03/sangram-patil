import java.util.*;
public class primeApp
 {
    public static void main(String x[])
     {
        Scanner xyz=new Scanner(System.in);
        int no,count=0,i=1;
        System.out.println("Enter the no");
        no=xyz.nextInt();

        while(i<=no)
         {
            if(no%i==0)
             {
                 count++;
             }
            i++;
         }
       if(count==2)
        {
            System.out.println("prime Number");
        }
        else
        {
             System.out.println("Not prime Number");
        }
      }
}
 