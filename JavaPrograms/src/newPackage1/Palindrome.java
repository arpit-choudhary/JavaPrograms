package newPackage1;

import org.apache.xpath.operations.Equals;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String s="Malayalam is the  keral language of the state.";
		String y[]=s.split(" ");
		int n=0;
		System.out.println(y.length);//Will tell after splitting how much values are in array.
		for (String m:y)
		{
			if(m.equals("the"))
			{
				n=n+1;
			}
			System.out.println(m);
		}
		System.out.println("(the) is printed "+n+" Times" );
		
		char a=s.charAt(0);//will print character
		System.out.println(a);
				System.out.println(s.replace("ay", "xx"));//replacing string
				System.out.println(s.replace('m', 'a'));//replacing Character
		
		String s1="";
		int z=0;
		for (int j=0;j<s.length();j++)
		{
			if((s.charAt(j))=='a')
			{
				z=z+1;
		
			}
			
		}
		System.out.println("found 'a' character " +z+" times");
		
		/*for(int i=s.length()-1;i>=0;i--)//reversing String
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		*/
		
		if(s.toLowerCase().equals(s1.toLowerCase()))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
