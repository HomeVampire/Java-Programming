import java.util.*;

public class ASS_4 {
    public static int mostVowels(String s1){
        int vowel=0;
        s1=s1.toLowerCase();
        for(int i = 0; i < s1.length(); ++i){
            char ch = s1.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }
        }
        return vowel;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The String:");
        String ss=sc.nextLine();

        String[] output=ss.split(" ");//To Split every word according to space
        String vowel="bb";

        for(int i=0;i<output.length;i++){
            if( mostVowels(vowel)<mostVowels(output[i])){
                vowel=output[i];
            }  
        }
        
        if(vowel=="bb"){
            System.out.print("There does not exist any word that contain vowels...");
        }
        else{
            System.out.print("The word with most vowels is: "+ vowel);
        }
        
    }
}