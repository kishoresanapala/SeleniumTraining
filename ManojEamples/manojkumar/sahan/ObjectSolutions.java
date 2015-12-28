package sahan;

public class ObjectSolutions {
	int a=20;//global variable

	public static void main(String[] args) {
		
int b=10;//local variable
System.out.println(b);
ObjectSolutions os=new ObjectSolutions();
System.out.println(os.a);
int c=os.addNumbers(5, 6);
System.out.println(c);
int d=os.subtraction();
System.out.println(d);
String name=os.printName("manoj");
System.out.println(name);
String name1=os.printName1();
System.out.println(name1);

	}
	int addNumbers(int a,int b){
		int c=a+b;
		return c;
	}
	int subtraction(){
		int a=10;
		int b=20;
		int d= (a-b);
		return d;
	}
	String printName(String name){
	return name;
		
	}
	String printName1(){
		String name1="manoj1";
		return name1;
	}

		
	}


