package JavaProgram;

import java.util.HashMap;


public class RepeatedWord {

	public static void main(String[] args) {

		System.out.println("-------------1 st Method-------------------");
		String str1 = "dsadasd, dsadas, sdsadsada";
		
		String arr[] = str1.split(",");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {

				if (arr[i].equals(arr[j])) {
					count++;
				}

			}
			System.out.println(arr[i] + "--->" + count);
		}

		System.out.println("--------------2nd method ------------------");
		
		String st = "I am am not the one who is thinking I one thing at time";
		
		String[] ar = st.split(" ");
		
		HashMap<String, Integer> mp = new HashMap<String, Integer>();
		int add = 0;

		for (int i = 0; i < ar.length; i++) {
			add = 0;

			for (int j = 0; j < ar.length; j++) {
				if (ar[i].equals(ar[j])) {
					add++;
				}
			}

			
			mp.put(ar[i], add);
		}

		System.out.println(mp);
		

		System.out.println("--------------3nd method ------------------");

		String str = "I am am not the one who is thinking I one thing at time";
		String[] arr1 = st.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String key : arr1) {
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		System.out.println(map);

		
		
		
		
		
		
		
		
		System.out.println("--------------4nd method ------------------");

		String str11 = "fdfsfsfsdfsf";
		char[] ch = str11.toCharArray();
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		for (char key : ch) {
			if (map1.containsKey(key)) {
				map1.put(key, map1.get(key) + 1);
			} else {
				map1.put(key, 1);
			}
		}
		System.out.println(map1);

		System.out.println("--------------5th Example of String buffer abd string builder------------------");
		
			String exmp= "virendra", stri = "kumar";
			StringBuilder strb= new StringBuilder(exmp);
			strb.append(stri);
			
			//strb.reverse();
			
			System.out.println("String builder"+ " "+strb);
			
			StringBuffer strbu = new StringBuffer(exmp);
			strbu.append(stri);
			
			System.out.println("String BUffer" + " "+strbu);
	
		
			System.out.println("--------------6th Example for removing scape sequence------------------");
			
		//	String Rstr = "Idff am am not the one who is thinking Isdfsdf one thing at time";
			

			   String srt= "this is robotics! ##we";
			    ResultData obj = new ResultData();
				String Rstra = obj.Sent_Rev(srt);
				System.out.println("Reverse of Sentence = " + Rstra);
	}

	

}
