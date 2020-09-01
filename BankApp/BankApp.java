import java.util.*;

class BankApp
{
	public static long amt = 10000000;
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("***** WELCOME TO YOUR ACCOUNT*****");
		System.out.println("Choose Option :");
		System.out.println("1. Check balance");
		System.out.println("2. Transfer money");
		System.out.println("3. Withdraw money");
		System.out.println("4. Receive money");
		System.out.println("5. Exit ");
		long mon;
		String s;
		do
		{
			System.out.println("Enter your option :");
			int n = in.nextInt();
			switch(n)
			{
			case 1:
				System.out.println("Your Current balance is :"+amt);
			break;
			case 2:
			
				System.out.println("Transfer Amount is :");
				mon = in.nextLong();
				if(mon<=amt)
				amt = amt - mon;
				else
				System.out.println("Transaction unsuccessful , insufficient amount");
			break;
			case 3 :
			
				System.out.println("Withdraw  Amount is :");
				mon = in.nextLong();
				if(mon<=amt)
				amt = amt - mon;
				else
				System.out.println("Your account does not contain sufficient amount");
			break;
			case 4 :
			
				System.out.println("Amount to be recieved");
				mon = in.nextLong();
				amt = amt + mon;
			
			break;
			case  5:
				s = "No";
			break;
			}
			System.out.println("Do you want to continue , Enter Yes or No :");
			s = in.next();
		}while(s.equals("Yes"));
		System.out.println("Thank You !! ");

	}
}