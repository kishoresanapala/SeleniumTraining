package learning;

public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int numbers[] = {32,43,53,54,32,65,63,98,43,23};
          
          //assign first element of an array to largest and smallest
          int smallest = numbers[0];
          int largetst = numbers[0];
         
          for(int i=1; i< numbers.length; i++)
          {
                  if(numbers[i] > largetst)
                          largetst = numbers[i];
                  else if (numbers[i] < smallest)
                          smallest = numbers[i];
                 
          }
         
          System.out.println("Largest Number is : " + largetst);
          System.out.println("Smallest Number is : " + smallest);
  }

	}

