/*Write a Java program (WAJP) to input a number and check whether the number is prime or not.*/

import java.util.*;

class Student{
	int roll;
	int marks;
	public Student(int r, int m){
		roll=r;
		marks=m;
	}
	public void showData(){
		System.out.println("ROLL ="+roll);
		System.out.println("MARKS ="+marks);
	  }

}


class ASS_1{
	public static Student[] sortbyRoll(Student [] arr, int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<(n-i-1);j++){
				if(arr[j].roll>arr[j+1].roll){
					int temp1=arr[j].roll;
					int temp2=arr[j].marks;
					arr[j].marks=arr[j+1].marks;
					arr[j].roll=arr[j+1].roll;
					arr[j+1].roll=temp1;
					arr[j+1].marks=temp2;
				}
			}
		}
		return arr;

	}	

	public static Student[] sortbyMarks(Student [] arr,int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<(n-i-1);j++){
				if(arr[j].marks>arr[j+1].marks){
					int temp1=arr[j].roll;
					int temp2=arr[j].marks;
					arr[j].marks=arr[j+1].marks;
					arr[j].roll=arr[j+1].roll;
					arr[j+1].roll=temp1;
					arr[j+1].marks=temp2;
				}
			}
		}
		return arr;
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no of students: ");
		int n=sc.nextInt();

		Student[] s;
		s = new Student[n] ;

		for(int i=0;i<n;i++){
			System.out.println("Enter Roll No. of the student: ");
			int roll=sc.nextInt();
			System.out.println("Enter Marks obtained by student '"+roll+"' :");
			int marks=sc.nextInt();

			s[i]=new Student(roll, marks);
		}

		s=sortbyRoll(s,n);
		System.out.println("AFTER SORT BY ROLL :");
		for(int i=0;i<n;i++){
			s[i].showData();
			System.out.println("");
		}
		
		s=sortbyMarks(s,n);
		System.out.println("AFTER SORT BY MARKS :");
		for(int i=0;i<n;i++){
			s[i].showData();
			System.out.println("");
		}
	}
}