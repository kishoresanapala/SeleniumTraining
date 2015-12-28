package basics;

public class SubString {

	public static void main(String[] args) {
		SubString ss=new SubString();
		ss.printname();
		
		// TODO Auto-generated method stub

	}
	void printname(){
		String name="manojkumar";
		System.out.println(name.indexOf("u"));
		System.out.println(name.substring(0,name.lastIndexOf("u")));
	}

}
