package basics;

public class Encapsulation {
	private int age;

	public static void main(String[] args) {
		Encapsulation c=new Encapsulation();
		c.setAge(28);
		System.out.println(c.getAge());
		// TODO Auto-generated method stub

	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}

}
