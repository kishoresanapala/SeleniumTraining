package javaexamples;

public class WithOutParameters {
	void printName1(){
		String name="kumar";
		System.out.println(name);
	}
	void numbers1(){
		int a=55;
		int b=55;
		System.out.println(a+b);
		
	}

	public static void main(String[] args) {
		WithOutParameters p=new WithOutParameters();
		p.printName();
		p.numbers();
		p.printName1();
		p.numbers1();
		// TODO Auto-generated method stub

	}
	void printName(){
		String name="sahan";
		System.out.println(name);
		
	}
	void numbers(){
		int a=10;
		int b=20;
		System.out.println(a*b);
		
		
		
	}

}
