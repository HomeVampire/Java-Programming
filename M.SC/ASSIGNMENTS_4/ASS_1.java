import java.util.*;

class ASS_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The String:");
        String ss=sc.nextLine();

        String[] output=ss.split(" ");//To Split every word according to space
        
        int n=output.length;
        System.out.println("The output is:");
        for(int i=0;i<n;i++){
            System.out.println(output[i]);
        }
    }

}