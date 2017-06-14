
public class StarPattern {

public static void main(String[] args) {
	int i,j,k;
	
	//Reverse Triangle
	for (i=5;i>=1;i--)
	{
		//Space
		for(j=4;j>=i;j--)
		{
			System.out.print(" ");
		}	
		
		//Printing Star
		for (k=1;k<=2*i-1;k++)
		{
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	//Star Triangle
	/*
	for (i=1;i<=5;i++)
	{
		for (j=4;j>=i;j--)
		{
			System.out.print(" ");
		}
		
		for(k=1;k<=(2*i-1);k++)
		{
			System.out.print("*");
		}	
	
		System.out.println();
	}
	*/
}

}
