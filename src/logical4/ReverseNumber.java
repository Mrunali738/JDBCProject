package logical4;

public class ReverseNumber {

	public static void main(String[] args) {
		//original number
		int number =1234;
		int reversedNumber = 0;
		int temp = 0;
		
		while (number>0){
			//use modulus oprator to strip of the last digit
			temp = number%10;
			//create the reversed number
			reversedNumber = reversedNumber * 10+ temp;
			number = number/10;
		}
		System.out.println("Reversed Number is:"+reversedNumber);
	}
}//program for reverse the given no


