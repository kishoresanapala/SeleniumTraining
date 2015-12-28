package javaexamples;

public class EncapsExample {
	private String location;

	public static void main(String[] args) {
		EncapsExample e = new EncapsExample();
		e.setLocation("lingampally");
		System.out.println(e.getLocation());
		// TODO Auto-generated method stub

	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}
}
