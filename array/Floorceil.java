import java.util.*;
  public class Floorceil
{
   public static void main(String x[])
{
     Scanner sc=new Scanner(System.in);
       int a[]=new int[8];
       int n,i,floor=-1,ceil=-1;
        System.out.println("Enetr  elements");
           for(i=0;i<a.length;i++)
                a[i]=sc.nextInt();
       
        int temp,j;
       for(i=0;i<a.length;i++)
       {
           for(j=i+1;j<a.length;j++)
           {
              if(a[i]>a[j])
               {
                 temp=a[j];
                  a[j]=a[i];
                  a[i]=temp;
               }
            }
        }
              for( n=0;n<=10;n++){
    for(i=0;i<a.length;i++)
         {
           if(a[i]>n)
            {
               floor=-1;
               ceil=a[i];
               break;
            }
          else if(a[a.length-1]<n)
            {
                floor=a[a.length-1];
                 ceil=-1;
                break;
            }
          else if(a[i]==n)
            {
                  floor=a[i];
                   ceil=a[i];
                 break;
             }
          else if(a[i]<n&&a[i+1]>n)
             {
                  floor=a[i];
                 ceil=a[i+1];
                  break;
              }
         }
    System.out.println("Ceil of  "+n+"  is "+ceil+" Floor of "+n+" is "+floor);

	}
}
}