package JavaProgram;

public class StringBaseProgram {
	
	 Boolean check(char arr)
      {
	  Boolean b = Character.isHighSurrogate(arr);
	  
	  return b;
      }
	
	void FindCapChar()
	{
		String str= "Virendra Kumar BhA@%$^gat";
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{     
			for(int j=0;j<arr[i].length();j++)
			{   
				
				if(check(arr[i].charAt(j)))
				{
					System.out.println("index : "+j+" and "+ arr[i].charAt(j));
				}
				else {
					//System.out.println(" "+ arr[i].charAt(j));
				}
			}
		}
		
	}
	
	void FindSpecialChar()
	{
		 String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}~0123456789";
		    String name="3_ saroj@@&*^&*@$%";
		    String str2[]=name.split("");

		    for (int i=0;i<str2.length;i++)
		    {
		    if (specialCharacters.contains(str2[i]))
		    {
		        System.out.println("true:"+str2[i]);
		        //break;
		    }
		
		    }
	}
	
	public static void main(String str[])
	{  
		System.out.println("str"+str);
		StringBaseProgram obj = new StringBaseProgram();
		obj.FindCapChar();
        obj.FindSpecialChar();
	}

}
