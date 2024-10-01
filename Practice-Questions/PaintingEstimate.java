import java.util.*;
public class PaintingEstimate{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	double inwallcostpersq=18;
	double outwallcostpersq=12;
	
	System.out.println("Enter number of inner walls");
	int  inwall=xyz.nextInt();
	double a[]=new double[inwall];
	System.out.println("Enter number of outer walls");
	int outwall=xyz.nextInt();
	double b[]=new double[outwall];
	
	System.out.println("Enter surface area of each interior wall");
	
	for(int i=0;i<a.length;i++){
	a[i]=xyz.nextDouble();
	}
	
	System.out.println("Enter surface area of each interior wall");
	
	for(int i=0;i<b.length;i++){
	b[i]=xyz.nextDouble();
	}
	
	double estiinwall=0, sumofinwall=0;
	for(int i=0;i<a.length;i++){
	sumofinwall=sumofinwall+a[i];
	 estiinwall=sumofinwall*inwallcostpersq;
	}
	
	System.out.println("Estimate of inner wall is => "+estiinwall);
	
	double estioutwall=0, sumofoutwall=0;
	for(int i=0;i<b.length;i++){
	sumofoutwall=sumofoutwall+b[i];
	 estioutwall=sumofoutwall*outwallcostpersq;
	}
	System.out.println("Estimate of outer wall is => "+estioutwall);
	
	System.out.println("total estimate of painting is => "+(estiinwall+estioutwall));
	
   }
}