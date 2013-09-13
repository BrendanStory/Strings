public class Strings {
	
	public static void main(String[] args) {
		String t = new String("A");
		String s = "BaseBall";
		String a = "acknow"

		if ( t.equals(s)) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}

		for (int i = 0; i<t.length(); i++ ) {
			System.out.println(t.charAt(i));
		}
	}

	public static boolean hasAnA(String s, String t) {

		int x = 0

		for ( int i = 0; i < s.length; i++) {
			if (s.equals(t)) {
				x = 1
			}
		}

		x == 1;
		return true;

	}

	// public static count(String s, String t) {
		
	// 	double count =  0.0;

	// 	for (int i = 0; i <s.length(); i++ ) {
	// 			if (s.equals(t)) {
	// 				count ++;
	// 			} else {

	// 			}
	// 		}	
	// }

	// public static boolean contains(String s, String t) {
	// 	for (int i=0; i<= s.length(); i++ ) {
	// 		if (s.substring(i, i + t.length().equals(t)) {
	// 			return true;
	// 		}
	// 	}
	// }
	
	public static boolean isAbecedarian(String a) {

		//pull individual parts of the string, set them to char 1 and char 2.
		//set char 1 = int x, and char 2 = int y.
		//compare if x < y
	}
}