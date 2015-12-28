package basics;

public class Name {
	public static void main(String args[]){
		Name n=new Name();
		n.printName();
			
		
	}
void printName(){
	String name="manoj kumar seepana 123";
	/*String[] n=name.split(" ");
	for (int i=0;i<n.length;i++){
		System.out.println(n[i]);*/
	/*System.out.println(name.length());
	System.out.println(name.charAt(22));*/
	String[] n=name.split(" ");
	for (int i=0;i<=name.length();i++){
		System.out.println(n[i].charAt(0));
	}
	}
}

