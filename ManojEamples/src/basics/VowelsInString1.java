package basics;

public class VowelsInString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		VowelsInString1 vowel=new VowelsInString1();
		vowel.VowelsTest();

	}
	
	// Manoj Naidu
	void VowelsTest() {
		String name="Jaya Venkata Sai Krishna Reddy Buthukuri";
		int i=0;
		for(int c=0;c<name.length();c++)
		 {
			
			if(name.charAt(c)=='a' || name.charAt(c)=='e' || name.charAt(c)=='e'|| name.charAt(c)=='i'|| name.charAt(c)=='u')
			{
			//  System.out.println(name.charAt(c));
			   i=i+1; 
			}
			
		}
		
		System.out.println(i);	
		
	}


	}


