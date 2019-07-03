package JavaProgram;

public class ResultData {
	
	public String Sent_Rev(String str)
	{
		String Allword[]= str.split(" ");
		
		String revSentence = " ";
		
//		for(String w: Allword)
//		{
//			StringBuffer word= new StringBuffer(w);
//			word.reverse();
//			revSentence+=word.toString()+" ";
//					
//		}
		
		System.out.println("Total length:"+Allword.length);
		
		for(int i=Allword.length-1;i>=0;i--)
		{
			String st1 = Allword[i];
			StringBuffer word= new StringBuffer(st1);
			
			System.out.println(Allword[i]);
			
			word.reverse();
			
			revSentence+=word.toString()+" ";
		}
		
		return revSentence;
		   
	}

}
