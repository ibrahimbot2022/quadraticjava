import java.util.*;
import java.math.*;


public class quadratic
{  public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		double a=sc.nextDouble();
		System.out.println("enter b");
		double b=sc.nextDouble();
		System.out.println("enter c");
		double c=sc.nextDouble();
		
			
		double d=b*b-4*a*c;
		


		if(d>0.0)
		{
			double r1=(-b+Math.pow(d,0.5)/(2.0*a));
			double r2=(-b+Math.pow(d,0.5)/(2.0*a));
			System.out.println("roots are:"+r1+"and"+r2);
		}
		else if(d==0.0)
		{	
			double r1=(-b/(2.0*a));
			System.out.println("roots are real and equal:"+r1);

		}
		else
		{
			System.out.println("roots are not real");
			double r1=-b/(2*a);
			double r2=Math.pow(-d,0.5)/(2.0*a);
			System.out.println("r1="+r1+"+"+r2+"and"+r1+"-"+r2);
		}
	}
}		
