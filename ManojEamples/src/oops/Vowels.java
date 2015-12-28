package oops;

public class Vowels {

	public static void main(Advisor[] args) {
		Vowels v = new Vowels();
		v.vowelsTest();

		// TODO Auto-generated method stub

	}

	public void vowelsTest() {
		String name = "manoj kumar seepana";
		int i = 0;
		for (int c = 0; c < name.length(); c++) {
			if (name.charAt(c) == 'a' || name.charAt(c) == 'e' || name.charAt(c) == 'i' || name.charAt(c) == 'o' || name.charAt(c) == 'u') {
				i = i + 1;
			}
		}
		System.out.println(i);
	}

}
