package sahan;

import basics.SubString;

public class EqualsExample {

	public static void main(String[] args) {
		EqualsExample ee=new EqualsExample();
		ee.equals();
		ee.equals1();
		ee.equals2();
		// TODO Auto-generated method stub

	}
	public void equals(){
		String name="manoj kumar seepana";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		String[] a=name.split(" ");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	void equals1(){
		String name ="Registration is successful";
		if(name.equals("Registration is successful"))
			System.out.println("Registration is successful message displayed");
		else
			System.out.println("Registration is successful message is not displayed");
		
	
	}
	public void equals2(){
		String name="manoj1234sahan";
		System.out.println(name.indexOf("s"));
		System.out.println(name.substring(0,name.indexOf("s")));
	}

}
