/*WAJP to Check whether a number is BUZZ number or not.
A BUZZ number is the number, which either ends with 7 or is divided by 7.*/

import java.util.*;

class ASS_5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int last_digit=n%10;
        if((last_digit==7) || (n%7==0)){
            System.out.println("The number is BUZZ number.");
        }
        else{
            System.out.println("The number is not-BUZZ number.");
        }
        
    }
}