package oops;

public class InterfaceExample1 implements InterfaceExample{
	public static void main(Advisor[] args) {
		InterfaceExample1 ie=new InterfaceExample1();
		ie.divNumbers(10, 2);
		InterfaceExample ie1=new InterfaceExample1();
		ie1.addNumbers();
		ie1.subNumbers();
		// TODO Auto-generated method stub

	}

	@Override
	public void addNumbers() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		//System.out.println("this is manojkumar");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subNumbers() {
		System.out.println("this is interface");
		// TODO Auto-generated method stub
		
	}
public void divNumbers(int x,int y){
	System.out.println(x/y);
}
}
