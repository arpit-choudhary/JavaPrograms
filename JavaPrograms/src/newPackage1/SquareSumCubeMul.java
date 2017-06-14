package newPackage1;

public class SquareSumCubeMul {

	public static void main(String[] args) {
	
		SquareSumCubeMul obj=new SquareSumCubeMul();
		int a=obj.square(2);
		int b=obj.cube(3);
		int c=obj.sum(a,b);
		System.out.println("Final result is "+ obj.mul(c,100));
		
		//Comment about memory of variable a,b declared as local in all Methods.
	}
	
	public int square(int a)//Square the number
	{
		return a*a;
	}
	
	public int cube(int a)//Cube the number
	{
		return a*a*a;
	}
	
	public int sum(int a,int b)// sum of number(square+cube)
	{
		return a+b;
	}
	
	public int mul (int a,int b)// Final Result
	{
		return a*b;
		
	}

}
