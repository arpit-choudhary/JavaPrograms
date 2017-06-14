package newpackage;

public class A {
	
	private void metA(){
		System.out.println("hi");
	}
	
	public void metA1(){
		this.metA();
		System.out.println("hello");
	}
	
	//Default method
	void metA2(){
		System.out.println("brother");
	}

}
