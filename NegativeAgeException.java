package Session6.Assignment2;

import java.util.Scanner;

public class NegativeAgeException extends Exception {

	public static void main(String[] args) {
		
		int age;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your Age");
		age =  sc.nextInt();
		
		while(true) {
			if (age >= 0 ) {
				System.out.println("Age is good");
				break;
			}
				try {
				if (age < 0 ) {
					System.out.println("Age cannot be Negative");
				}
				}catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		}
	}// TODO Auto-generated method stub

	
