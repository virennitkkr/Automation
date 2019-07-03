package JavaProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MethodOverriding {
	
	void Display() throws Exception 
	{
		System.out.println("This is Parent class");
		HashMap <String, String> map = new HashMap<String, String>();
		map.put("NIT", "It is my collage");
		map.put("NIIT Tech", "It's my First Company");
		map.put("Infogain", "It's my Second Company");
		
		System.out.println("using for-each loop for iteration over Map.entrySet()");
		
		 for(Entry<String, String> e : map.entrySet())
		 {
			 System.out.print("Key :   "+ e.getKey());
			 System.out.println(" and Value :  "+e.getValue());
		 }
		 System.out.println("Iterating over keys or values using keySet()and values() methods");
		 
		 // Iterating over key
		 for(String key :map.keySet())
		 {
			 System.out.println("Key " + key);
			 
			 System.out.println(map.get(key));
			 
		 }

		 for(String val : map.values())
		 {
			 System.out.println("values " + val);
		 }
		 
		 System.out.println(" Iterating over keys and searching for values (inefficient)");

		 for(String key :map.keySet())
		 {
			 System.out.println(map.get(key));
		 }
	}
}
