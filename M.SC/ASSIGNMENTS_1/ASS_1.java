/*Write a Java program (WAJP) to input a number and check whether the number is prime or not.*/

import java.util.*;

class ASS_1{
	public static void main(String args[]){
		// ;
		try(Scanner sc=new Scanner(System.in)){
			//rest of your code
			System.out.println("Enter The Number");
			int n=sc.nextInt();
			int i=0;
			int flag=0;
			for(i=2;i<=n/2;i++){
				if(n%i==0){
					flag=1;
					break;				
				}		
			}
			if(flag==1){
				System.out.println("The number is not-Prime");		
			}
			else{
				System.out.println("THe Number is prime");	
			}
		}
			
	}
}