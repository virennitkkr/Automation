package qa.pages;

import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {

		HelloWorld obj = new HelloWorld();

		obj.givenSentence();

	}

	void givenSentence() {
		String str = "Hello India Hi Hello Hi Hello India Hi Hello Hi Hello India Hi Hello Hi Hello India Hi Hello Hi gfghf ghfghf jtyrjmhj tyefdgfg gdgdfg gdhfgh gdfgfdg gdfgdfg gfd";
		String arr[] = str.split(" ");

		HashMap<String, Integer> map = new HashMap();

		for (String key : arr) {

			String k = rev(key);

			if (map.containsKey(k)) {
				map.put(k, map.get(k) + 1);
			} else {
				map.put(k, 1);
			}

		}

		System.out.println("Map details: " + map);

	}

	public String rev(String str) {
		String rw = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rw = rw + str.charAt(i);
		}
		return rw;
	}

}