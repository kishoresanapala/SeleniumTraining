package basics;

public class MethodsExample {

	
	public static void main(String[] args) {
		MethodsExample oe=new MethodsExample();
		int z=oe.addNumbers(5, 3);
		System.out.println(z);
		
		String lingampally=oe.printName2("Hyderabad");
		System.out.println(lingampally);
	}
	
	int addNumbers(int a,int b){
		int c=a+b;
		return c;
	}
	
	String printName(){
		String name="Kishore";
		return name;
	}
	
	String printName1(){
		return "Kishore";
	}
	
	String printName2(String name){
		return name;
	}
	
}
