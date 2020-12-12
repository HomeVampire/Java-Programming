/*WAJP to check whether a multi-digit number is unique or not. A unique number will not have any repeated digits.*/

import java.util.*;

class ASS_4{
    public static int isUnique(int n){
        for(int i=1;n/i>0;i=i*10){
            int check=(n/i)%10;
            int count=0;
            for(int j=1;n/j>0;j=j*10){
                int digits=(n/j)%10;
                if(check==digits){
                    count++;
                }
                if(count>1){
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        
        int flag=isUnique(n);

        if(flag==1){
            System.out.println("Digits are repeated in the number");
        }
        else{
            System.out.println("Digits are not-repeated in the number");
        }
    }
}




