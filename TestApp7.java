public class TestApp7
{
    public static void main(String x[])
    {   int a,b,c;
	boolean d;
	a=b=c=1;
	d = ++a>=++b || ++a>2;
	System.out.printf("A=%d\tB=%d\tD=%b\n",a,b,d);
    }
}

