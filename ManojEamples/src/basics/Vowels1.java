package basics;

public class Vowels1 {

	public static void main(String[] args) {
		Vowels1 v=new Vowels1();
		v.printname();
		// TODO Auto-generated method stub

	}
	void printname(){
		String name=" manojkumar seepana sahan kumar seepana";
		int i=0;
		for(int c=0;c<name.length();c++){
			if(name.charAt(c)=='a'||name.charAt(c)=='e'||name.charAt(c)=='i'||name.charAt(c)=='o'||name.charAt(c)=='u'){
				i=i+1;
			}
			
			}
		System.out.println(i);
	}

}
