class CustomizeException{
	
   public static void main(String args[]){
  try{
       throw new MyException(2);
       // throw is used to create a new exception and throw it to catch block.
  }
  
 catch(MyException e){
	 System.out.println("Hello");
    System.out.println(e) ;
 }
}
}
class MyException extends Exception{
   int a;
   MyException(int b) {
     a=b;
   }
   
   //Overriding "toString()" method of Exception Class.
   public String toString(){
	   System.out.println("HI");
     return ("Exception Number =  "+a) ;
  }
}