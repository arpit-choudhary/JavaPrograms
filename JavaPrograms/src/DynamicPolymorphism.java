public class DynamicPolymorphism{
     public static void main(String args[]){
        X x= new X();
       Y y = new  Y();
       y.d=10;
       
       y.m3();//Ref. variable of 'Y' Child Class pointing to protected method of Super class.
       y.m2();
      x.m1();
      y.m1();
     x = y;// parent pointing to object of child
     x.m1() ;
     //x.m5(); wrong as Beside 'x' is ref variable of Class X but ponting to object of Child class,still it can't access method of Class 'Y' except Overridden method.This is dynamic polymorphism
     //y.a=10;
   }

}
class X{
   private int a;
   int b;
   protected int d; 
   
      public void m1(){
       System.out.println("This is method m1 of class X");
     }
      protected void m3(){
    	  System.out.println(d);
          System.out.println("This is method m4 of class X");
        }
}

class Y extends X{
      int c; // new instance variable of class Y
         public void m1(){
            // overriden method
            System.out.println("This is method m1 of class Y");
        }
       public void m2(){
           super.m1();
           System.out.println("This is method m2 of class Y");
      }
       
       public void m5(){
           // overriden method
           System.out.println("This is method m5 of class Y");
       }
}