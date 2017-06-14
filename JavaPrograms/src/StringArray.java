
public class StringArray {
	

	public static void main(String[] args) {
		
		String a[]={"ram","shyam","srpit","ankit"};
		int b[]={9,8,7,6,5};
		//String s=new String("HELLO");
		String s="HELLO";
		
		for(int i=s.length()-1;i>=0;i--)//Reverse of string
		{
			System.out.print(s.charAt(i));
		}
		
		/*for(int j=s.length()-1;j>=0;j--)//Reverse of string
		{
			char x=s.charAt(j);
			System.out.print(x);
		}
		*/
	
		
		/*String c=new StringBuffer(s).reverse().toString();   //shortcut method for Reverse of string
		
		System.out.println(c);//Reverse of String.
		*/
		
		
		/* comparison of number & string array.
		for (int k=0;i<a.length;k++)
			
		{
			System.out.println(a[k]);
			System.out.println(b[k]);
			
		}
		*/
	}
	


}
