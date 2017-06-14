package newpackage;

public class FibonacciMethod {
	
	public void fiboSeries(){
		
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		
		while(a+b<100)
		{
			b=a+b;
			a=b-a;
		System.out.println(""+b);
		}
	}
	

}
