import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashMapExample{
  public static void main(String[] args){
    /*HashMap<String, String> objMap = new HashMap<String, String>();
    objMap.put("Name", "Suzuki");
    objMap.put("Type", "2-wheeler");
    objMap.put("Power", "220");
    objMap.put("Price", "85000");
    */
	  
	  /*
	  HashMap<String,Integer> objMap = new HashMap<String, Integer>();
	    objMap.put("Name", 1);
	    objMap.put("Type", 2);
	    objMap.put("Power", 3);
	    objMap.put("Price", 6);
	    
	   System.out.println(objMap.get("Name"));//Want to get value for a particular key
	   
	    //Alternative Method to get Key Value pair using "ForEach" Loop.
	    Set<String> objKey=objMap.keySet();
	  
	    for(String i:objKey)
	    {
	    	System.out.println(i + ":" + objMap.get(i));
	    }
	    
	    */
	  
	 
	  HashMap<Integer,Integer> objMap = new HashMap<Integer, Integer>();
	    objMap.put(5, 1);
	    objMap.put(6, 2);
	    objMap.put(7, 3);
	    objMap.put(8, 4);
	   
	  //Alternative Method to get Key Value pair using "ForEach" Loop.
	    Set<Integer> objKey=objMap.keySet();
	  
	    for(Integer i:objKey)
	    {
	    	System.out.println(i + ":" + objMap.get(i));
	    }
	    
	  
    System.out.println("Elements of the Map:");
    System.out.println(objMap);
    
    
    System.out.println(objMap.keySet());//To get all keys
    System.out.println(objMap.values());//To get all Values
    System.out.println(objMap.containsKey(5));//To see key is present or not
    System.out.println(objMap.containsValue(2));//To see Value is present or not
    System.out.println(objMap.isEmpty());//To check HashMap contains KeyValue pairs or not.
    System.out.println(objMap.remove(6));//To remove particular keyValuePair by passing key to method.
    
  }
}