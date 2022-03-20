package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		int number = 13;
		boolean flag = false;{
		for(int i=2; i<=number/2; ++i) {
			if(number%i==0) {
				flag = true;
				break;
			}
			}
			if(!flag) 
				System.out.println(number+ " is a prime number.");
				else
					System.out.println(number+ " is not a prime number.");
			}
	}
}
		

	


