import java.util.*;

class Member{
    String name;
    int age;
    String phone_number;
    String address;
    int salary;

    Member(String name, int age, String phone_number, String address, int salary){
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary(){
        System.out.println("SALARY: " + salary);
    }
}

// TODO: Hierarchical Inheritance:
class Employee extends Member{  //! Inherit Member class into Employee class
    String specialization;

    Employee(String name, int age, String phone_number, String address, int salary, String specialization){
        super(name, age, phone_number, address, salary);
        this.specialization = specialization;
    }

    public void printData(){
        System.out.println("Details of the Employee: ");
        System.out.println("NAME: " + name);
        System.out.println("AGE: "+ age);
        System.out.println("PHONE NUMBER: " + phone_number);
        System.out.println("ADDRESS: " + address);
        printSalary();
        System.out.println("SPECIALIZATION: " + specialization);
    }
}
class Manager extends Member{   //! Inherit Member class into Manager class
    String department;

    Manager(String name, int age, String phone_number, String address, int salary, String department){
        super(name, age, phone_number, address, salary);
        this.department = department;
    }

    public void printData(){
        System.out.println("Details of the Manager: ");
        System.out.println("NAME: " + name);
        System.out.println("AGE: "+ age);
        System.out.println("PHONE NUMBER: " + phone_number);
        System.out.println("ADDRESS: " + address);
        printSalary();
        System.out.println("DEPARTMENT: " + department);
    }
}

public class Main{
    public static void main(String args[]){
        String str;
        Scanner sc = new Scanner(System.in);
        Scanner sc_str = new Scanner(System.in);    //! To use nextLine()
        while(true){
            System.out.println("1 to Enter data for 'Employee'\n2 to Enter data for 'Manager'");
            System.out.print("Press any other number to 'Exit'\nEnter your choice... ");

            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("\nEnter details for Employee...");
                System.out.print("SPECIALIZATION: ");
                str = sc_str.nextLine();;    //! Here str holds specialization

            }
            else if(choice == 2){
                System.out.println("Enter details for Manager...");
                System.out.print("DEPARTMENT: ");
                str = sc_str.nextLine();;    //! Here str holds department
            }
            else{
                break;
            }
            System.out.print("NAME: ");
            String name = sc_str.nextLine();
            System.out.print("AGE: ");
            int age = sc.nextInt();
            System.out.print("PHONE NUMBER: ");
            String phone_number = sc.next();
            System.out.print("ADDRESS: ");
            String address = sc_str.nextLine();
            System.out.print("SALARY: ");
            int salary = sc.nextInt();
            System.out.print("\n");

            if(choice == 1){
                Employee emp = new Employee(name, age, phone_number, address, salary, str);
                emp.printData();
                System.out.print("\n");
            }
            else{
                Manager mng = new Manager(name, age, phone_number, address, salary, str);
                mng.printData();
                System.out.print("\n");
            }
        }
    }
}