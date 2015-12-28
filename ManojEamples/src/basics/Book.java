package basics;

public class Book {

	public static void main(String[] args) {
		Book b=new Book();
		b.vowelsString();
		// TODO Auto-generated method stub

	}
void vowelsString(){
	String name="manoj kumar seepana ";
	int i=0;
	for(int c=0;c<name.length();c++){
		if (name.charAt(c)=='a'||name.charAt(c)=='e'||name.charAt(c)=='i'||name.charAt(c)=='o'||name.charAt(c)=='u'){
			i=i+1;
			//System.out.println(i);
		}
	}
	System.out.println(i);
	}

}
