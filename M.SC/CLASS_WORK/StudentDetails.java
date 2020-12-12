import java.util.*;

class StudentDetails{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll & Marks");
		int roll=sc.nextInt();
		int marks=sc.nextInt();		
		Student s1=new Student();
		s1.input(roll,marks);
		s1.display();
	}	
}

class Student{
	int roll;
	int marks;
	
	void input(int x, int y){
		roll=x;
		marks=y;
	}
	void display(){
	System.out.println("Roll="+roll);
	System.out.println("marks="+marks);
	}
	
}


