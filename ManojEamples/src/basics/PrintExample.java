package basics;

public class PrintExample {
	
	int a=10;

	void printName(String name,int age){
		System.out.println("My name is "+name+" and my age is "+ age);
	}
		void printName1(String name,int age){
			System.out.println(" my name is "+name+" and my age is "+age);
		}
	

	public static void main(String[] args) {
		int b=40;
		PrintExample se = new PrintExample();
		se.printName("Manoj", 26);
		System.out.println(b);
		System.out.println(se.a);
		se.printName1("manoj", 22);
	}
	
	
	

	
}
