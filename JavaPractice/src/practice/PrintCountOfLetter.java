package practice;

import java.util.HashMap;
import java.util.Map;

//Print a count of letter in word for example I/p - "asdaddf sss"  O/p - a-2 s-4 d-3 f-1
public class PrintCountOfLetter {

	public static void main(String[] args) {
		String s = "ssnjeevje";	
		Map<Character,Integer> hm=new HashMap<Character, Integer>();	
		int c=0;
		for (int i = 0; i < s.length(); i++) {
			if(hm.containsKey(s.charAt(i))) {
				c=hm.get(s.charAt(i));
				hm.put(s.charAt(i), c+1);
			}else
				hm.put(s.charAt(i), 1);
		}
		System.out.println(hm);
	}
}
