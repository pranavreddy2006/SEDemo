import java.util.*;
public class anagram{
	public boolean isanagram(String s1, String s2){
		char a[] = s1.toLowerCase().toCharArray();
		char b[] = s2.toLowerCase().toCharArray();
		int count = 0;
		if (s1.length() != s2.length()){
			return false;
		}
		for (int i = 0; i < s1.length(); i++){
			for (int j = 0; j < s2.length(); j++){
				if (a[i] == a[j]){
					count = count + 1;
				}
			}
		}
		if (count == s1.length()){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter one string:");
		String s1 = s.nextLine();
		System.out.println("Enter another string:");
		String s2 = s.nextLine();
		anagram o = new anagram();
		if (o.isanagram(s1,s2)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
}
