package javaexamples;

public class WithParameters {

	public static void main(String[] args) {
		WithParameters wop=new WithParameters();
		wop.printName("cricket");
		wop.numbers(10, 5);
		// TODO Auto-generated method stub

	}
	void printName(String name){
		System.out.println(name);
		
		
	}
	void numbers(int x,int y){
		System.out.println(x-y);
		System.out.println(x+y);
		System.out.println(x*y);
	}

}
