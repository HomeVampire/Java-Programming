import java.util.*;

public class InterestCalculation{
    public static void main(String args[]){
        int principal;
        int time;
        int rate;
        float interest;
        int flag = 0;
        
        try{
            principal = Integer.parseInt(args[0]);
            time = Integer.parseInt(args[1]);
            rate = Integer.parseInt(args[2]);
            System.out.println("Principal: " + principal);
            System.out.println("Time (months): " + time);
            System.out.println("rate of Interest (%): " + rate);
            
            interest = (float)(principal * time * rate) / (float)100;
            System.out.println("Total amount of interest: "+ interest);
        }catch (NumberFormatException e) {
            System.out.println("Arguments must be integers...");
            flag = 1; 
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No of argument is not enough...");
            flag = 1;
        }
        
        if(flag == 1){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print("\nEnter Principal: ");
                principal = sc.nextInt();
                System.out.print("Enter time (months): ");
                time = sc.nextInt();
                System.out.print("Enter rate of interest: ");
                rate = sc.nextInt();
                
                interest = (float)(principal * time * rate) / (float)100;
                System.out.println("Total amount of interest: "+ interest);
            }catch(InputMismatchException e){
                System.out.println("Again you enter wrong input...\nStart again from beginning");
                System.exit(1);
            }
        }
        
    }
}