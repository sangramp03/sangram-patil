public class pattern5
{

    public static void main(String x[])
    {
        int i,j;
        boolean flag=true;
        for(i=1; i<=4;i++)
        {
            for(j=1;j<=7;j++ )
            {
                if(j>=1 && j<i &&  flag==true)
                {System.out.print(i); 
                flag=false;
                }
                else
                {System.out.print("*");
                     flag=true;
                }
            }
            System.out.println();
        }
    }
}