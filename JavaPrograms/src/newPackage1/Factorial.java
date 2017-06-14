package newPackage1;

public class Factorial {

	
	public static void main(String[] args) {
		
		Factorial obj=new Factorial();
		obj.facnum(5);
	}
	
	public void facnum(int a)
	{
		int i =1;
		int total=1;
		while (i<=a)
		{
			total=total*i;
			i++;
			
		}
		System.out.println(total);
	}

}
