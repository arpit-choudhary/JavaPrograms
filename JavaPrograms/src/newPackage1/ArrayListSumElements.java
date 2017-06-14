package newPackage1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSumElements {
	
	public static void main(String[] args) {
		int sum=0;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(2);
		arr.add(20);
		arr.add(21);
		arr.add(22);
	
		System.out.println(arr);
		Iterator i=arr.iterator();
		while(i.hasNext())
		{
			sum=sum+(int)(i.next());
		}
		System.out.println(sum);
	}

}
