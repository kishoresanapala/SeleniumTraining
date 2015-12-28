package learning;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[] = new int [20];

		Array[0] = 0;

		Array[1] = 1;

		for (int i = 2; i < Array.length; i++) {

		 //System.out.println("value of c is" + " " );

			Array[i]=Array[i-1] + Array[i-2];

		System.out.println(Array[i-2]);

		}

		}

		
	}


