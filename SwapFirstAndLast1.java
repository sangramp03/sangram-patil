import java.util.*;
 public class SwapFirstAndLast1
  {
    public static void main(String args[])
     {
       int last,first,mid,n,temp,count,x;
         Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       n=sc.nextInt();
         temp=n;
        count=0;
            while(n>0)
            {
              count++;
              n=n/10;
            }
       System.out.println("Number of digits = "+count);
     n=temp;
       x=1;
          while(count>1)
          {
               x=x*10;
               count--;
          }
        System.out.println("X Factor is "+x);
     last=n%10;
     first=n/x;
     mid=(n%x)/10;
    System.out.println("First="+first+" last= "+last+" Mid="+mid);
     n=last*x+mid*10+first;
   System.out.println("After Swap of First and last digit = "+n);
   }
}
  