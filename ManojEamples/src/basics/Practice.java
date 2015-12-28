package basics;

public class Practice {

	public static void main(String[] args) {
		Practice p=new Practice();
		p.printName();
		p.printName1();
		// TODO Auto-generated method stub

	}
	void printName(){
		String name="manoj kumar seepana";
		String[] n=name.split(" ");
		for(int i=0;i<name.length();i++){
			System.out.println(n[i].charAt(0));
		}
		
		
	}

	void printName1(){
		String name="TRAN2342134";

		System.out.println(name.indexOf("N"));
		System.out.println(name.substring(0, name.indexOf("N")));	
	}
}
