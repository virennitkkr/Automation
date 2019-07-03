package TestData;

import java.util.HashMap;

public class SpliString {


	static void SpliStr(String str)
	{
		
		StringBuffer alpha = new StringBuffer();

		StringBuffer charac = new StringBuffer();
		
		StringBuffer number = new StringBuffer();
		
		HashMap<Integer, Character> alphaM = new HashMap< Integer, Character>();
		HashMap<Integer, Character> characM = new HashMap< Integer, Character>();
		HashMap<Integer, Character> numberM = new HashMap< Integer, Character>();
		
		char arr[] = str.toCharArray();
		
		for (int i =0;i<arr.length;i++)
		{
			if(Character.isDigit(arr[i]))
			{
				number.append(arr[i]);
				numberM.put(i, arr[i]);
			}
			else
			{
				if(Character.isAlphabetic((arr[i])))
				{
					charac.append(arr[i]);
					characM.put(i, arr[i]);
					
				}
				
				else
				{
					alpha.append(arr[i]);
					alphaM.put(i, arr[i]);
				}
			}
		}
		
		System.out.println("All alphaBet : "+alpha);
		System.out.println("All charac   : "+charac);
		System.out.println("All number   : "+number);
		
		System.out.println("--------------------MAP out put-----------------");
		
		System.out.println("All alphaBet : "+alphaM);
		System.out.println("All charac   : "+characM);
		System.out.println("All number   : "+numberM);
		
	}
}
