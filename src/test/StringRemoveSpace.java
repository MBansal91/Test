import java.util.HashMap;

public class StringRemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am Mayank Bansal";
		String finalStr = "";
		int lenght = str.length();
		int i =0;
		HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
		while(i < lenght) {
			if(hash.containsKey(str.charAt(i))) {
				int val = hash.get(str.charAt(i));
				hash.put(str.charAt(i), val+1);
			} else {
				hash.put(str.charAt(i), 1);
			}
			if(str.charAt(i) != ' ') {
				finalStr = finalStr + str.charAt(i);
			}
			i++;
		}
		System.out.println(hash);
		System.out.println(finalStr);
	}

}
