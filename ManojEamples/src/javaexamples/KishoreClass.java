
package javaexamples;

public class KishoreClass implements Durga_Interface {
	
	static KishoreClass Kis;
	public static void main(String args[]) {
		//KishoreClass Kis= new KishoreClass();     -- Right onlhy
		Kis=new KishoreClass();
		
		Kis.Manoj();
		Kis.KishoreMethod();
		
	//	Durga_Interface test=new Durga_Interface(); ---- Error. Bcoz we can't create object for an interface
		
	//	KishoreClass test=new Durga_Interface();          ---- Error
		
		 Durga_Interface test=new KishoreClass();      // This way of representaion is called 'Runtime Polymorphism"
		test.Manoj();
//		test.KishorMethod(); --------------- Error..
		
	}
	@Override
	public void Manoj() {
		// TODO Auto-generated method stub
		System.out.println("This is Manoj Abstract method implemented");
		
	}
	
	public void KishoreMethod () {
		System.out.println("This is not abstrast method");
	}

}
