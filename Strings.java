package learning;

public class Strings {
	
	public static String reverseWord(String str) {
		String revStr = "";
		for(int i = 0; i < str.length(); i++) {
			revStr = str.charAt(i) + revStr;
		}
		
		return revStr;
	}
	
	public static void reverseEachWord(String str) {
		String reverseWords = "";
		
		String revStr[] = str.split(" ");
		
		for(String word : revStr) {
			
			reverseWords = reverseWords + reverseWord(word) + " ";
		}
		
		System.out.println(reverseWords);
	}

	public static void main(String[] args) {
		String str1 = new String("bishwajit khanra");
		String str2 = "Bishwajit";
		System.out.println(str1.split(" ").length);
		reverseEachWord(str1);
	}

}
