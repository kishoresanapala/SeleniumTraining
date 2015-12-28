package oops;

public class Split {

	public static void main(String[] args) {
		Split s=new Split();
		s.StringName();
		// TODO Auto-generated method stub

	}
	public void StringName(){
		String name="manojkumar seepana";
		String[] n=name.split("");
		for(int i=0;i<name.length();i++){
			System.out.println(n[i].charAt(0));
		}
	}

}
