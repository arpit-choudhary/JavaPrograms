package newPackage1;

public class ArrayElementCount {
	
	
	
	public static void main(String[] args) {
		int arr[]={1,2,3,4,2,2,3,5,4};
		int z=0;
		
		for(int x : arr)
		{
			if (x==3)
			{
				z=z+1;
				
			}
		}
		System.out.println("3" + " is " + " " +z +" time");
		
		
	}

}
