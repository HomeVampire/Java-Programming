import java.io.*;
import java.util.*;


public class CountryCapital{ 
    public static void main(String args[])throws IOException{ 

        File country = new File("files\\Country.txt");
        File capital = new File("files\\Capital.txt");
        FileWriter countryCapital = new FileWriter("files\\CountryCapital.txt");

        if(country.exists() && capital.exists()){
            Scanner scCountry = new Scanner(country);
            Scanner scCapital = new Scanner(capital);
 
            while (scCountry.hasNextLine() && scCapital.hasNextLine()){
                countryCapital.write("The Capital of " + scCountry.nextLine() + " is " + scCapital.nextLine() + "\n");
            }
            countryCapital.close();
        }
        else{
            System.out.println("Files are missing...");
        }     
    } 
} 
