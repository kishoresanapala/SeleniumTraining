package basics;

public class ForLoop {

	public static void main(String[] args) {
		ForLoop fl=new ForLoop();
		fl.forLoopExample();
		fl.forLoopExample();

	}
	
	void forLoopExample(){
		/*int a=10;
		a=a+1;
		a++;
		System.out.println(a);*/
		
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}
}
