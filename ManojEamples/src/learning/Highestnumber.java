package learning;

public class Highestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] numbers={20,50,30,40,10,70};
        int largest = Integer.MIN_VALUE;

         

        for(int i =0;i<numbers.length;i++) {

            if(numbers[i] > largest) {

                largest = numbers[i];

            }

        }

         

        System.out.println("Largest number in array is : " +largest);

	}

}
