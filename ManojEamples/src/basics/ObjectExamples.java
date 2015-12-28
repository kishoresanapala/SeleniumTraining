package basics;

public class ObjectExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectExamples oe=new ObjectExamples();
		int c=oe.addNumbers(5,3);
		System.out.println(c);
		int k=oe.subtraction(6, 2);
		System.out.println(k);
		String name=oe.printName();
		System.out.println(name);
		String name1=oe.printName1("kishan");
		System.out.println(name1);
		
		
	}
	int addNumbers(int a,int b){
		int c=a+b;
		return c;
	}
    int subtraction(int x,int m){
    	int k=x-m;
    	return k;
    }
 
    
    String printName(){
    	 String name="manoj";
    	return name;
    	
    }
    String printName1(String name){
    	return name;
    	
    	
    }
}
