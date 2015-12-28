package basics;

public class StringExample {

	public static void main(String[] args) {
			StringExample se=new StringExample();
			se.exampleOfStrings();
			se.exampleOfStrings1();
			se.exampleOfStrings2();

	}
	
	void exampleOfStrings(){
		String name ="Kishore";
		System.out.println(name);
		System.out.println(name.length()); // number of characters
		
		System.out.println(name.charAt(3));
		
		String name1="My Name is Kishore";
		String[] n=name1.split("");
		for(int i=0;i<n.length;i++){
			System.out.println(n[i]);
		}
		
	}

	void exampleOfStrings1(){
		String name ="Registration is successful";
		if(name.equals("Registration is successful"))
			System.out.println("Registration is successful message displayed");
		else
			System.out.println("Registration is successful message is not displayed");
		
	}
	
	void exampleOfStrings2(){
		String name="TRAN2342134";

		System.out.println(name.indexOf("N"));
		System.out.println(name.substring(0, name.indexOf("N")));
	}
	
}
