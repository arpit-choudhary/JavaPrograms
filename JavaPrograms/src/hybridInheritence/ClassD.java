package hybridInheritence;

public class ClassD extends ClassB implements ClassC,ClassE{
	public static void main(String[] args) {
		
		ClassD obj=new ClassD();
		obj.mul();
		obj.sum();
		obj.sub();
		obj.div();
		obj.mod();
		
	}



	@Override
	public void div() {
		System.out.println(a/b);
		
	}

	@Override
	public void mod() {
		System.out.println(a%b);
		
	}



	@Override
	public void mul() {
		System.out.println(a*b);
		
	}

}
