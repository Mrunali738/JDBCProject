package logical4;

import java.util.Scanner;

public class DemoClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(n*i);
		}
	
		
	}

}
