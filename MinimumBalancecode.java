package coding;

import java.util.Scanner;

public class MinimumBalancecode {
	public static void main(String[]args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Add balance: ");
			int balance=sc.nextInt();
			
			System.out.println("Withdrawal Amount: ");
			int withdrawal=sc.nextInt();
			
			try {
				if(balance<1000 && balance<withdrawal) {
					throw new insufficientBal("Insufficient Balance");
				}
				if(balance-withdrawal>=1000) {
				System.out.println("Balance Updated");
				}
				else {
					throw new insufficientBal("Invalid Transaction");
				}
			}
			catch(insufficientBal ib){
				ib.printStackTrace();
			}
		}
	}
		
  }
		
	
	
	
	class insufficientBal extends RuntimeException{
		
		public insufficientBal(String msg) {
			super(msg);
		}
	}

	