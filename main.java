import java.util.HashMap;

public class main {

	public static void main(String args[]) {

		String s1 = args[0];
		String s2 = args[1];
		
		HashMap<Character,Character> mp = new HashMap<Character,Character>();
		
		if(s1.length() != s2.length()) {
			System.out.println("false");
			return;
		}
		for(int i=0;i<s1.length();i++) {
			
			if(mp.get(s1.charAt(i))== null) {
				// if not found put it in map
				mp.put(s1.charAt(i),s2.charAt(i));
			}else {
				// if the a character is found to have a different mapping , its false, since foo cannot map to bar, but bar can map to foo
				char c = mp.get(s1.charAt(i));
				if(c != s2.charAt(i)) {
					System.out.println("false");
					return;
				}
			}
		}
		System.out.println("true");
	}
}