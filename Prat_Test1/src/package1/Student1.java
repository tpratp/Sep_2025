package package1;

public class Student1 
{
int age , rollno;

public void age()
{
	System.out.println("Student age is:" +age);
	
}

public void rollno()
{
	System.out.println("Student Rollno is:" +rollno);
}
public static void main(String[] args)
{
	Student1 Prat=new Student1();
	Prat.age=27;
	Prat.rollno=20;
	Prat.age();
	Prat.rollno();
	
	Student1 Mahi=new Student1();
	Mahi.age=30;
	Mahi.rollno=25;
	Mahi.age();
	Mahi.rollno();
	
}
}
