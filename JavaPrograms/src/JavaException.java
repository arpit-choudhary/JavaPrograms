class JavaException {
	public static void main(String args[]){
	try{
		int d =0;
		int n =20;
		
		//Nested TRY block
		try{
			int a =0;
			int b =10;
			
			int fraction = b/a;
			System.out.println("HI");
			//int g[] ={1} ;
			//g[20] =100;
			}
		
		catch(Exception e){//Excetion is Base Class of RunTime Exception
			System.out.println("In the nested catch clock due to Exception = "+e);
			}
		finally{
			System.out.println("ankit");
			
		}
		int fraction = n/d;
		System.out.println("HI");
		//int g[] ={1} ;
		//g[20] =100;
		}
	
	catch(Exception e){//Excetion is Base Class of RunTime Exception
		System.out.println("In the main catch clock due to Exception = "+e);
		}
	
	finally{
		System.out.println("arpit");
		
	}
	
	
	try{
		int d =0;
		int n =10;
		
		int fraction = n/d;
		System.out.println("HI");
		//int g[] ={1} ;
		//g[20] =100;
		}
	
	catch(Exception e){//Excetion is Base Class of RunTime Exception
		System.out.println("In the other TryCatch clock due to again Exception = "+e);
		}
	finally{
		System.out.println("ankit");
		
	}
	
	 
	
/*catch(ArithmeticException e){
	System.out.println("In the catch clock due to Exception = "+e);
}
catch(ArrayIndexOutOfBoundsException e){
	System.out.println("In the catch clock due to Exception = "+e);
}
*/
	System.out.println("End Of Main");
	}
}