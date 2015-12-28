package javaexamples;

public class UsingInterface implements InterfaceExample{

	static UsingInterface ui;
	public static void main(String args[]){
		ui= new UsingInterface();
		ui.addNumbers(); //4
		
		//InterfaceExample ie= new InterfaceExample();
		
		InterfaceExample ie = new UsingInterface(); // runtime polymorphism
		ie.addNumbers(); //3
		
	}
	
	@Override
	public void addNumbers() {

		System.out.println("Added");
	}

	@Override
	public void subNumbers() {

		System.out.println("Sub");
	}

	@Override
	public void divNumbers() {
		System.out.println("div");
		
	}
	
	public void multiplyNumbers(){
		System.out.println("Multi");
	}

}
