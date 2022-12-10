package technical_ques;
import java.util.*;
public class FindAnagrams {

	public static void main(String[] args) {
		String str[] = {"eat","tea","tan","ate","nat","bat"};
		for(int i=0 ; i<str.length;i++) {
			for(int j=i+1 ; j<str.length;j++) {
				findAnagrams(str[i],str[j]);
			}
		}
	}
	public static void findAnagrams(String str1,String str2) {
		if(str1.length() != str2.length()) {
			
		}
		//frequency of each character
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0 ; i<str1.length();i++) {
			if(map.containsKey(str1.charAt(i))) {
				map.put(str1.charAt(i),map.get(str1.charAt(i))+1);
			}
			else {
				map.put(str1.charAt(i),1);
			}
		}
		for(int i=0 ; i <str2.length();i++) {
			
		}
	}
}
