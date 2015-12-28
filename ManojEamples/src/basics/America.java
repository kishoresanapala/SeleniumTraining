package basics;

public class America {

	public static void main(String[] args) {
		America a=new America();
		a.stringsExample();
		
	
		// TODO Auto-generated method stub

	}
	// d12u2r10g1a
	
	void stringsExample(){
	
		String name1="This is Infosys Ltd";
		
		String[] n=name1.split(" ");
		
		for(int i=0;i<n.length;i++){
			System.out.println(n[i].charAt(0));
		}

	}}
