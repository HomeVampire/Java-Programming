/*WAJP to input a multi-digit number and check is it palindrome or not.*/

import java.util.*;

class ASS_3{
    
    static void isPalindrome(int n){
        int reverse=0;
        for(int i=1;n/i>0;i=i*10){
            reverse=(reverse*10)+(n/i)%10;
        }
        if(n==reverse){
            System.out.println("The number is Palindrome.");
        }
        else{
            System.out.println("The number is not-Palindrome.");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        ASS_3.isPalindrome(n);
    }
}