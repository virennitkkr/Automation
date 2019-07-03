package JavaProgram;

public class Singleton {
	
	 private static Singleton single_instance = null;

	/* Static instance method */
	 
	 public  String s;
	
	public  Singleton()
	{
		s = "This is Singleton constractor";
	}
	
	public static Singleton getInstance()
	{
		if(single_instance==null)
		  single_instance = new Singleton();
		
		return single_instance;
		
	}
	
	public static void main(String arg[])
	{
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		/* chnaging the varibale */
		x.s = (x.s).toUpperCase();
		y.s = (y.s).toLowerCase();
		x.s = (z.s).toUpperCase();
		
		System.out.println("x.s = "+x.s);
		System.out.println("y.s = "+y.s);
		System.out.println("z.s = "+z.s);
	}

}
