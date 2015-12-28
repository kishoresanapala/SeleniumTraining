package oops;

public class Polymorphism {

	public static void main(Advisor[] args) {
		// TODO Auto-generated method stub

	}
	public void addNumbers(int a,int b){
		System.out.println(a+b);
	}
	public void addNumbers(int a,int b,int c){
		System.out.println(a+b+c);
		
	}
	public void addNumbers(Advisor name,int age){
		System.out.println("my name is " + name + " and my age is " + age);
		
	}

}
