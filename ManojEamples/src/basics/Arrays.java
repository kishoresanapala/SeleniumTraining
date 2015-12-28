package basics;

public class Arrays {

	public static void main(String[] args) {

		Arrays a = new Arrays();
		a.arrayExample();
	}
	
	void arrayExample(){
		int a=10;
		int[] b={10,20,70,60,90};
		
		String names[]={"Kishore","Manoj"};
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		
		for(int i=0;i<names.length;i++){
			System.out.println(names[0]);
		}
		
	}
	
	

}
