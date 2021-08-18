import java.util.ArrayList;
import java.util.Arrays;

public class ContainingSubstring {


	static String[] getWordsContainingSubstring(String text, String subString) {

		int count = 0;
		ArrayList<String> list = new ArrayList<String>();
		String [] textS= text.split("\\s|\\.|\\,");
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(textS));

		System.out.println("The unfiltered string is: ");
		System.out.println(list1);
		System.out.println("");
		System.out.print("The filtered string is:");

		String[] strings = new String[list1.size()];
		String[] resultS = new String[list1.size()];
		for (int i = 0; i < list1.size(); i++) {
			strings[i] = list1.get(i);
			if (strings[i].contains(subString)) {
				resultS[count++]=strings[i];
			}

		}
		for (int j=0; j<count; j++){
			System.out.print(" "+resultS[j]);
		}

		return resultS;
	}

	public static void main(String args[]) {
		String s1 = "This is some text for testing. Search for words containing, the given substring.";
		getWordsContainingSubstring(s1, "ing");

	}
}
