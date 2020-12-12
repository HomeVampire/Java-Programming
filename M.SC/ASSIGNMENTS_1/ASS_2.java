/*WAJP to input a multi-digit number and count number of digits.*/

import java.util.*;

class ASS_2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int counter=0;
        for(int i=1;n/i>0;i=i*10){
            counter++;
        }
        System.out.println("Total number of digits are: "+counter);
    }
}