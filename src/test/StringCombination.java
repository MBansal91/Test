import java.util.HashMap;

public class StringCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "May";
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		int i = 0;
		for(Integer h = 0;h<str.length(); ++h) {
			String st = Character.toString(str.charAt(h));
			hashMap.put(st, h+1);
		}
		while(i<str.length()) {
			for(int j = i+1;j<str.length(); ++j) {
				for(int k =j;k<str.length();++k) {
					System.out.println("i:"+i+", j:"+j+", k:"+k);
					String s = str.substring(i, j);
					s = s + str.charAt(k);
					StringBuilder rev = new StringBuilder(s);
					rev = rev.reverse();
					String reverse = rev.toString();
					if(hashMap.containsKey(s)) {
						Integer count = hashMap.get(s);
						hashMap.put(s, count+1);
					} else {
						hashMap.put(s, 1);
					}
					/*if(hashMap.containsKey(reverse)) {
						Integer count = hashMap.get(reverse);
						hashMap.put(reverse, count+1);
					} else {
						hashMap.put(reverse, 1);
					}*/
				}
			}
			i++;
		}
		System.out.println(hashMap.keySet());

	}

}
