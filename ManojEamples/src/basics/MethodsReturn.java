package basics;

public class MethodsReturn {
	int d=20;
	int e=30;
	String name1="kishan";
	float f1=12.34f;
	boolean was=false;

	public static void main(String[] args) {
		int a=5;
		int b=6;
		int c=7;
		MethodsReturn mr=new MethodsReturn();
		System.out.println(a+b+c);
		System.out.println(a+b-c);
		System.out.println(a*b*c);
		System.out.println(a*b-c);
		System.out.println("print something");
		String name="manoj";
		System.out.println(name);
		boolean is =false;
		System.out.println(is);
		boolean was=true;
		System.out.println(was);
		float f=0.25f;
		System.out.println(f);
		System.out.println(mr.d+mr.e);
		System.out.println(mr.name1);
		
		System.out.println(mr.f1);
        System.out.println(mr.was);
        System.out.println(mr.d*mr.e);
        mr.addNumbers();
        mr.subtraction(7, 2);
        mr.printName();
        mr.printName1("kishan");
        int z=mr.addNumbers1();
        System.out.println(z);
        int z1=mr.subtraction1(55, 75);
        System.out.println(z1);
        String name2=mr.printname2();
        System.out.println(name2);
       String name3=mr.printName3("india");
       System.out.println(name3);
       String name4=mr.printName4("kishore", 30);
       System.out.println(name4);
        
	}
	void addNumbers(){
		int x=15;
		int y=20;
		int z=x+y;
		System.out.println(z);
	}
	String printName4(String name4,int age){
		
		return "my name is "+name4+" and my age is "+ age;
		
	}
	void subtraction( int x,int y){
		System.out.println(x-y);
	}
	void printName(){
		String name="manoj";
		System.out.println(name);
	}
	void printName1(String name){
		System.out.println(name);
		
		
	}
	int addNumbers1(){
		int x=20;
		int y=35;
		int z=x+y;
		return z;
		
	}
	int subtraction1(int x,int y){
		int z1=(x-y);
		return z1;
	}
	String printname2(){
		String name2="hello world";
		return name2;
	}
	String printName3(String name3){
		System.out.println(name3);
		return name3;
		
	}

}
