import java.util.*;

public class ASS_8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The String: ");
        String ss=sc.nextLine();

        System.out.print("The output is: ");
        String[] output=ss.split(" ");//To Split every word according to space
        String temp;
        String data="";
        for(int i=0;i<output.length;i++){
            temp=output[i].toUpperCase();
            data=data+temp.charAt(0);
            temp=output[i].toLowerCase();
            for(int j=1;j<temp.length();j++){
                data=data+temp.charAt(j);
            }
            data=data+" ";
        }
        System.out.print(data);
    }
}