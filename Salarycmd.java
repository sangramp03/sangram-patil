public class Salarycmd
{
public static void main(String x[])
{
int bs,da,hra,total;
bs=Integer.parseInt(x[0]);
da=bs*30/100;
hra=bs*30/100;
total=bs+da+hra;
System.out.println("total salary is:"+total);
}
}