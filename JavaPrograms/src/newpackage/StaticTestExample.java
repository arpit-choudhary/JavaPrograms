package newpackage;

public class StaticTestExample{
	   public static void main(String args[]){
	     Student s1 = new Student();
	     s1.showData();
	     Student s2 = new Student();
	     s2.showData();
	     Student.increment();
	     Student.b++;
	     s1.showData();
	  }
	}

	class Student {
	static int a; //initialized to zero
	static int b; //initialized to zero only when class is loaded not for each object created.

	  Student(){
	   //Constructor incrementing static variable b
	   b++;
	  }

	   public void showData(){
	      System.out.println("Value of a = "+a);
	      System.out.println("Value of b = "+b);
	   }
	public static void increment(){
	b++;
	}

	}