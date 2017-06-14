package newpackage;


public class B extends A{
	
	public static void main(String[] args) {
	A obj=new A();
	obj.metA1();
	obj.metA2();//Default method inheriting b/z Class A & B are in same package.
	

}
}
