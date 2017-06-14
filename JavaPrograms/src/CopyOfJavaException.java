class CopyOfJavaException {
	public static void main(String args[])throws ArithmeticException{
	
		int d =5;
		int n =20;
		int result = n/d;
		System.out.println(result);
	
	System.out.println("End Of Main");
	
	
	CopyOfJavaException obj=new CopyOfJavaException();
	obj.checkException();
	
	}
	public void checkException()
	{
		System.out.println("hi");
		System.out.println("hello");
		int i =10;
		int j =0;
		int z = i/j;
		System.out.println(z);
	}
}