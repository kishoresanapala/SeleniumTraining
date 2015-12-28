package basics;

public class OopsExample {

	private int age;

	public static void main(String[] args) {
		
		OopsExample oe = new OopsExample();
		oe.setAge(28);
		System.out.println(oe.getAge());
		
	}

	public void setAge(int age){
		this.age=age;
	}
	
	public int getAge(){
		return age;
	}
}
