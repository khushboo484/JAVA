import  java.util.*;
import  java.lang.*;

class SchoolManagement
{
	public static void main(String args[])
	{
		System.out.println("------------------------------------   WELCOME   ---------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your option :\n1.  Student\n2.  Teacher ");
		int n = sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Enter your name: ");
			String name = sc.next();
			System.out.println("Enter your roll no:  ");
			int roll = sc.nextInt();
			Student s = new Student(name,roll);
		break;
		case 2:
			System.out.println("Enter your name: ");
			String Name = sc.next();
			System.out.println("Enter your ID:  ");
			int id = sc.nextInt();
			Teacher t = new Teacher(Name,id);
		break;
		default:
			System.out.println("You have entered wrong option.");
		}
	}
}

class Teacher 
{
	Scanner sc = new Scanner(System.in);
	String Name,dept;
	int ID,department;
	String Dept[] = {"kgt","lct","tgt","lgt","ogt","sgt"};
	int Salary[] = {20000,25000,30000,40000,15000,10000};
	Teacher(String Name,int ID)
	{
		this.Name = Name;
		this.ID  = ID;
		System.out.println("Enter your department ");
		dept = sc.next();
		display();
	}
	public void display()
	{
		for(int i=0;i<6;i++)
		{
			if(Dept[i].equals(dept))
			{
				department = i;
				break;
			}
		}
		System.out.println("*********************************************************");
		System.out.println("Your Name is "+ Name);
		System.out.println("Your teacher ID is "+ID);
		System.out.println("Your Department is  "+ Dept[department]);
		System.out.println("Your Monthly salary is  Rs."+ Salary[department]);
		System.out.println("Your Annual Salary  is  Rs."+ Salary[department]*12);
		System.out.println("THANK YOU !!! "); 
		System.out.println("*********************************************************");
	}
}

class Student
{
	Scanner sc = new Scanner(System.in);
	String Name,clas;
	int rollno,index;
	int adm = 15000;
	int fees[] = {6000,4000,4500,5000,5500};
	Student(String Name, int rollno)
	{
		this.Name = Name;
		this.rollno = rollno;
		System.out.println("Enter your class: ");
		clas = sc.next();
		show();
	}
	public void show()
	{
		if(clas.equals("UKG") || clas.equals("NUR") || clas.equals("PRE-NUR") || clas.equals("LKG"))
			index = 0;
		else if(Integer.parseInt(clas)>=1 &&  Integer.parseInt(clas)<=5)
			index = 1;
		else if(Integer.parseInt(clas)>=6 && Integer.parseInt(clas)<=8)
			index = 2;
		else if(Integer.parseInt(clas)>=9 && Integer.parseInt(clas)<=10)
			index = 3;
		else if(Integer.parseInt(clas)>=11 && Integer.parseInt(clas)<=12)
			index = 4;
		System.out.println("*******************************************************************");
		System.out.println("Your Name is "+ Name);
		System.out.println("Your Roll.No is "+ rollno);
		System.out.println("You study in  "+ clas + "th  class");
		System.out.println("Your admission fee is  Rs."+adm);
		System.out.println("Your monthly fees is  Rs."+ fees[index]);
		System.out.println("Your annual fees is  Rs." + 12*fees[index]);
		System.out.println("THANK YOU !! ");
		System.out.println("*******************************************************************");
		
	}
}