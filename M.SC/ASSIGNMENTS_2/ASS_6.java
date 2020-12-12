/*WAJP to to input a multi-digit number and print whether the number is Special Number or not.
A number is said to be special number if the sum of the factorial of the digits of the number is same as the original number.
145 is a special number as 1! + 4! + 5! = 1 + 24 + 120 = 145.*/

import java.util.*;

class ASS_6{
    static int factorials(int x){
        int sum=1;
        while(x>0){
            sum=sum*x;
            x--;
        }
        return sum;
    }

    static int isSpecial(int n){
        int sum=0;
        for(int i=1;n/i>0;i=i*10){
            int digits=(n/i)%10;
            sum=sum+factorials(digits);
        }
        if(sum==n){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        int flag=isSpecial(n);
        
        if(flag==1){
            System.out.println("The number is Special Number.");
        }
        else{
            System.out.println("The number is not-Special Number.");
        }
        
    }
}