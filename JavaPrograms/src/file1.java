import java.io.*;
class file1{
	public static void main(String[] args) {
	     try{
	           FileWriter file = new FileWriter("c:\\a.txt");
	           file.write("arpit999999999");
	           file.close();
	    }
	    catch(IOException e){}
	  }
	}