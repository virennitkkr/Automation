package JavaProgram;

import java.util.ArrayList;

import java.util.Iterator;

public class FailFastIterators {
	public static void main(String[] args) 
    {
        //Creating an ArrayList of integers
         
        ArrayList<Integer> list = new ArrayList<Integer>();
         
        //Adding elements to list
         
        list.add(1);
         
        list.add(2);
         
        list.add(3);
         
        list.add(4);
         
        list.add(5);
         
        //Getting an Iterator from list
         
       // System.out.println(list);
        Iterator<Integer> it = (Iterator) list.iterator();
         
        while (it.hasNext())
        {
            Integer integer = (Integer) it.next();
            
            it.remove();
            //list.remove(integer);
            
            System.out.println(list);
             
            //list.add(8457);      //This will throw ConcurrentModificationException
        }
        
        System.out.println(list);
       
    }   

}
