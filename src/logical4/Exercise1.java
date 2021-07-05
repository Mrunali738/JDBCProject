package logical4;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		int i,n,sum = 0;{
		Scanner in = new Scanner(System.in);
		System.out.println("Input number:");
		
		n = in.nextInt();
		}
		System.out.println("The first n Natural Numbers are:"+n);
		for(i=1;i<=n;i++) {
			System.out.println(i);
			sum+=i;
			}
		System.out.println("The sum of natural number upto n terms:"+sum);
	}
}//Display n term of natural numbers and their sum
