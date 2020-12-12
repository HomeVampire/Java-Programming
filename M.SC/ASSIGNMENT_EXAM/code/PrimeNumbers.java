import java.util.*;

public class PrimeNumbers{
    int start;
    int end;

    public PrimeNumbers(){
        setRange();
        printList();
    }

    public void setRange(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Starting point: ");
        start=sc.nextInt();
        System.out.print("Enter End point: ");
        end = sc.nextInt();
    }

    public boolean isPrime(int a){
        if(a == 0 || a == 1){   //! 0 and 1 are not prime numbers
            return false;
        }
        else{
            for(int i=2; i<=a/2; i++){
                if(a%i == 0){
                    return false;
                }
            }
            return true;
        }
        
    }

    public void printList(){
        System.out.println("The Prime numbers are:");
        while(start <= end){
            if(isPrime(start)){
                System.out.println("[" + start + "]");
            }
            start ++;
        }
    }

    public static void main(String args[]){
        PrimeNumbers p = new PrimeNumbers();
    }
}