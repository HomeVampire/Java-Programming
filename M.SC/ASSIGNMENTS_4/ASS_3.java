import java.util.*;


public class ASS_3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The String:");
        String ss=sc.nextLine();

        String[] output=ss.split(" ");//To Split every word according to space
        
        //System.out.println("The No. of words are: "+ output.length);
        String max=output[0];

        for(int i=1;i<output.length;i++){
            if(max.length() < output[i].length()){
                max=output[i];
            }
        }
        System.out.print("The lenthiest word is: "+ max);
        
    }
}