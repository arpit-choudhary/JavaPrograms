package newpackage;

abstract class Shape{
	   final int b = 20;
	   public void display(){
	     System.out.println("This is display method");
	   }
	   abstract public void calculateArea();
	}

	 class Rectangle extends Shape{
	   public static void main(String args[]){
	      Shape obj = new Rectangle();
	      obj.display();
	     //obj.b=200;
	  }
	   public void calculateArea()
	   {
	   }
	   
	 }


	
	
