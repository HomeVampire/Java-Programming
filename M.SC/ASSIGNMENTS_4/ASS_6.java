import java.util.*;

public class ASS_6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The String:");
        String ss=sc.nextLine();
        System.out.println("Enter The Pattern to check:");
        String pattern=sc.nextLine();

        if(ss.contains(pattern)){
            System.out.print("The pattern exist in the string...");
        }
        else{
            System.out.print("The pattern does not exist in the string...");
        }
    }
}