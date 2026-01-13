package coding;

import java.util.Scanner;

public class AgeEligibilityCheckcode {
public static void main (String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Check Your Age;");
		int age=sc.nextInt();
		
		try {
			if (age<21 || age>35) {
				throw new BelowAge("Registration Is Not Done!");
			}
			System.out.println("Registration Is done!");
		}
		catch(BelowAge ob){
			ob. printStackTrace();
		}
	}
}


class BelowAge extends RuntimeException {
	
	public BelowAge(String msg) {
		super(msg);
	}
}


