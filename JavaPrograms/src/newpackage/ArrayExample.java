package newpackage;

public class ArrayExample {

	static int a[]={1,2,3,4,9};
	
	public static void main(String[] args) {
		
		
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.println(a[i]);	
		}
		int sum=0;
		for (int i = 0; i < a.length; i=i+4) {
			sum+=a[i];	
		}
		System.out.println(sum);
	}

}
