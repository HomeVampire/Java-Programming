import java.util.*;

public class StringSort{
    String[] str;
    int n;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of Strings: ");
        n = sc.nextInt();
        str = new String[n];
        System.out.println("Enter your string one by one: ");
        Scanner sc_str = new Scanner(System.in);    //! always use new scanner class with nextLine();
        for(int i=0; i<n; i++){
            str[i] = sc_str.nextLine(); //! It allows namespace
        }
    }

    public void printData(){
        System.out.println("Your sorted output is: ");
        for(int i=0; i<n; i++){
            System.out.println(str[i]);
        }
    }

    public void sortString(){
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){ 
                //! The compareTo() method compares two strings lexicographically.
                //* note: compareToIgnoreCase() to compare two strings lexicographyically, ignoring lower case and upper case differences.
                if (str[i].compareTo(str[j])>0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        StringSort ss = new StringSort();
        ss.getData();
        ss.sortString();
        ss.printData();
    }
}