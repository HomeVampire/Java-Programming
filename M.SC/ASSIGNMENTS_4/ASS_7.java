import java.util.*;

public class ASS_7{
    public static String rev(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The String: ");
        String ss=sc.nextLine();

        System.out.println("The outputs are:");
        String[] output=ss.split(" ");//To Split every word according to space
        String temp;
        for(int i=0;i<output.length;i++){
            String data="";
            temp=output[i].toUpperCase();
            data=data+temp.charAt(0);
            temp=output[i].toLowerCase();
            for(int j=1;j<temp.length();j++){
                data=data+temp.charAt(j);
            }
            output[i]=data;
        }
///////////////////////////////////////////////////////////////////////////////////////////        
        for(int i=0;i<output.length;i++){
            System.out.print(output[i].charAt(0));
        }

        System.out.println("");
/////////////////////////////////////////////////////////////////////////////////////////
        for(int i=0;i<output.length;i++){
            if(i==output.length-1){
                System.out.print(" "+ output[i]); 
            }
            else{
                System.out.print(output[i].charAt(0)+"."); 
            }
        }
        
        System.out.println("");
///////////////////////////////////////////////////////////////////////////////////////
        System.out.print(output[output.length-1]);
        for(int i=0;i<output.length-1;i++){
            System.out.print(" "+output[i].charAt(0)+"."); 
        }
        
        System.out.println("");
/////////////////////////////////////////////////////////////////////////////////////////
        System.out.print(output[0]);
        System.out.print(" ");
        System.out.print(output[output.length-1]);
    
        System.out.println("");
//////////////////////////////////////////////////////////////////////////////////////////
        temp=output[0].toUpperCase();
        System.out.print(temp.charAt(0)+" ");
        temp=output[output.length-1].toUpperCase();
        System.out.print(temp.charAt(0));

        System.out.println("");
/////////////////////////////////////////////////////////////////////////////////////////
        temp=output[0].toUpperCase();
        System.out.print(temp.charAt(0)+".");
        temp=output[output.length-1].toUpperCase();
        System.out.print(temp.charAt(0)+".");

        System.out.println("");
////////////////////////////////////////////////////////////////////////////////////////
        for(int i=0;i<output.length;i++){
            System.out.print(rev(output[i])+" ");
        }

        System.out.println("");
///////////////////////////////////////////////////////////////////////////////////////
        for(int i=output.length-1;i>=0;i--){
            System.out.print(output[i]+" ");
        }

        System.out.println("");
    }
}