package abstractEexample;

import abstractEexample.ClassA;

public class ClassB extends ClassA{
	
	public void sum()
	{
		System.out.println(a+b);
	}
	
	public void mul()
	{
	
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		ClassB obj=new ClassB();
		obj.sum();
		obj.sub();
		obj.mul();
		
	}
}
