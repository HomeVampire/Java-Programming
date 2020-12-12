import java.util.*;

public class ASS_5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The String:");
        String ss=sc.nextLine();

        String[] output=ss.split(" ");//To Split every word according to space
        int count=0;
        
        for(int i=0;i<output.length;i++){
            output[i]=output[i].toLowerCase();
            for(int j=0;j<output[i].length()-1;j++){
                if(output[i].charAt(j)==output[i].charAt(j+1)){
                    count++;
                    break;
                }
            } 
        }
        
        System.out.print("The number of words having consecutive repeated alphabets is: "+count);
        
        
    }
}