package JavaProgram;

import javax.swing.plaf.synth.SynthStyle;

public class MethodOverloading {
	void display()
	{
  System.out.println("Default Method");
	}
void display(String s)
{
	 System.out.println("String method");
}
void display(Object o)
{
	 System.out.println("OBject type method");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj = new MethodOverloading();
		obj.display();
		obj.display("NULL");
		obj.display(obj);
		
		

	}

}
