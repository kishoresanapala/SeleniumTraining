package basics;

public class Methods {

	public static void main(String[] args) {

		Methods m = new Methods();
		m.forLoop();
	}
	
	// 1 3 5 7 ... 20
	
	void forLoop(){
		// for(intilization;condition;[increment/decrement])
		
		for(int i=1;i <=20;){
			System.out.println(i);
			i=i+2;
		}
		
		
	}

}
