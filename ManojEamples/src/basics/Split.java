package basics;

public class Split {

	public static void main(String[] args) {
		 Split s=new  Split();
		 s.StringExample();
		// TODO Auto-generated method stub

	}
	void StringExample(){
		String name="manoj kumar seepana";  
		String[] n=name.split("");
		for(int i=0;i<name.length();i++){
			System.out.println(n[i]);
		}
	}

}
