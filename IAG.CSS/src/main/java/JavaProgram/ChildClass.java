package JavaProgram;

import java.io.File;
import java.io.FileNotFoundException;

public class ChildClass extends MethodOverriding{
	
	void Display() throws ArithmeticException
	{
		System.out.println("This is child class");
		
		//File file = new File("dsfsd");
	}

	
	
	public static void main(String []arg) throws Exception
	{
		MethodOverriding obj1 = new MethodOverriding();
		
		MethodOverriding obj2 = new ChildClass();
		
		obj1.Display();
		//obj2.Display();
		
		
	}

}
