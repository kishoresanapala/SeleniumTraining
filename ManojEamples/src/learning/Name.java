package learning;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void printName(){
		String name="sahan kumar seepana";
		String[] n=name.split(" ");
		for (int i=0;i<name.length();i++){
			System.out.println(n[i].charAt(0));
		}
	}

}
