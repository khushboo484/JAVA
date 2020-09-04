import java.util.*;
import java.lang.*;

class  StudentManagement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		List<Student>  studentList =  new ArrayList<>();
		System.out.println("-------------------  WELCOME --------------------------");
		System.out.println("Enter  Students  data ");
		String option;
		do
		{
			System.out.println("===========================================");
			System.out.println("Enter Name: ");
			String name = sc.next();
			System.out.println("Enter Roll No.: ");
			int roll = sc.nextInt();
			System.out.println("Enter Class: ");
			int clas = sc.nextInt();
			System.out.println("Enter total fees: ");
			int fees = sc.nextInt();
			Student ss = new Student(name, roll, clas, fees);
			studentList.add(ss);
			System.out.println("Enter amount of fee wants to pay now :");
			int paying = sc.nextInt();
			ss.paidFees(paying);
			System.out.println(ss);
			System.out.println("Wants to enter more ? \nEnter \"YES\" or \"NO\"  ");
			option = sc.next();

		}while(option.equals("YES"));

	}
}

class Student
{
	private String name;
	private int id;
	private int fees;
	private int paid;
	private int balance;
	private int clas;
	//private Courses  course;

	Student(String name , int id, int clas , int fees)
	{
		this.name = name;
		this.id = id;
		this.clas = clas;
		this.fees = fees;
		this.paid = 0;
		this.balance = 0;
	}

	public String getName()
	{	return name;
	}

	public int getId()
	{	return id;
	}

	public int getClas()
	{	return clas;
	}

	public int getFees()
	{ 	return fees;
	}

	public void  paidFees(int paidfee)
	{	this.paid = paidfee;
		balanceFees();
	}

	public int getPaidFees()
	{	return paid;
	}

	public void balanceFees()
	{	this.balance = this.fees  -  this.paid;
	}

	public int getBalance()
	{	return balance;
	}

	public String toString()
	{
		return "The  status of student "+ name + " having id " + id + " studying in class  " + clas + "th  with amount of fees to be paid  Rs." + getFees() + " but paid only  Rs." + getPaidFees() + " amount and balance of fees to give in future is Rs." + getBalance();
	}
}