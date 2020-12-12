import java.util.*;

public class ASS_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The String:");
        String ss=sc.nextLine();

        String[] output=ss.split(" ");//To Split every word according to space
        
        System.out.println("The No. of words are: "+ output.length);
        
    }
}