package learning;

public class Practice {

	public static void main(String[] args) {
		 Practice p=new  Practice();
		 p.identify();
		// TODO Auto-generated method stub

	}
	public void identify(){
		int[] a={20,30,10,15,50,90,80,70};
		int smallest = a[0];
		int largest = a[0];
		for(int i=0;i<a.length;i++){
			if (a[i]>largest)
			largest=a[i];
			else if(a[i]<smallest)
			smallest=a[i];
		}
		System.out.println("largest number is = " + largest);
		System.out.println("smallest number is = "+ smallest);
				
				
				
				
				
				
		
	}

}
