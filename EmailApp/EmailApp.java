import java.util.Scanner;
import java.lang.Math;

class EmailApp
{
	public static void main(String args[])
	{
		Mail email = new Mail();
		email.input();
		email.display();
	}
}

class Mail 
{
	String id;
	String pwd;
	public static Scanner sc = new Scanner(System.in);
	public void input()
	{
		System.out.println("**********WELCOME **********");
		System.out.println("Enter your details ");
		System.out.print("Enter your E-mail id : ");
   		id = sc.next();
		System.out.print("Enter your password : ");
		pwd = sc.next();
		System.out.println(" You are logged in !! ");
	}
	public void display()
	{
		System.out.println("Choose an option");
		System.out.println("1. Check mailbox capacity ");
		System.out.println("2. Set Alternate email ");
		System.out.println("3. Change password");
		System.out.println("4. log out ");
		System.out.println("====================");
		System.out.println();
		int n = sc.nextInt();
		do
		{
			switch(n)
		{
		 case 1:
			Functions.check();
		break;
		case 2: 
			Functions.setmail();
		break;
		case 3:
			Functions.change(pwd);
		break;
		case 4: 
			System.out.println("You are Logged out successfully..");
		break;
		default :
			System.out.println("You entered wrong option.");
		}
		}while(n != 4);
	}
}
class Functions  extends Mail
{
	public static Scanner sc = new Scanner(System.in);
	static String alter;
	public static void change(String pass)
	{
		System.out.println("****************************************************************");
		System.out.println("Enter your New password :");
		String newp = sc.nextLine();
		pass = newp ;
		System.out.println("Your password has been changed !! ");
		System.out.println("****************************************************************");
	}	
	public static void setmail()
	{
		System.out.println("****************************************************************");
		System.out.println("Set your alternative e-mail id :");
		alter = sc.next();
		System.out.println("Your alternative mail is updated ");
		System.out.println("****************************************************************");
	}
	public static void check()
	{
		System.out.println("****************************************************************");
		int m = 0;
		System.out.println("Did you recieve any mail , Yes or No !");
		String op = sc.next();
		if(op.equals("Yes"))
    		{
			m++;
		}
		System.out.println("Your mailbox contains "+m +"number of mails ");
		System.out.println("****************************************************************");
	}
}