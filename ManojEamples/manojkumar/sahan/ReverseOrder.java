package sahan;

public class ReverseOrder {

	public static void main(String[] args) {
		ReverseOrder rs=new ReverseOrder();
		rs.order();
		// TODO Auto-generated method stub

	}
	public void order(){
		String name="manoj kumar seepana";
		String[] n=name.split(" ");
		for(int i=0;i<name.length();i++){
			System.out.println(n[i]);
		}
	}

}
