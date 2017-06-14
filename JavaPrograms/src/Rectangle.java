abstract class Shape{
   int b = 20;
   public void display(){
     System.out.println("This is display method");
   }
   abstract public void calculateArea();
}

class Rectangle extends Shape{
   public static void main(String args[]){
      Rectangle obj = new Rectangle();
      obj.display();
     int c=obj.b;
     System.out.println(c);
  }

@Override
public void calculateArea() {
	// TODO Auto-generated method stub
	
}
}