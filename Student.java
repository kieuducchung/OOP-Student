
package oop;
import java.util.Scanner;


public class Student {
    
    String ID;
    String fullName;
    String dateOfBirth;
    String major;
    float gpa;
    
    public Student(){}
    public Student(String ID, String fullName, String dateOfBirth, String major, float gpa){
        this.ID = ID;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
        this.gpa = gpa;
 
    }
       
    public void enterStudentInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student ID: ");
        this.ID = scanner.nextLine();
        System.out.println("Enter Full Name: ");
        this.fullName = scanner.nextLine();
        System.out.println("Enter Date Of Birth (dd/mm/yyyy): ");
        this.dateOfBirth = scanner.nextLine();
        System.out.println("Enter major: ");
        this.major = scanner.nextLine();
        System.out.println("Enter Gpa: ");
        this.gpa = scanner.nextFloat();

   }
    public void displayInformation(){
        System.out.println("ID: " + this.ID + ", Name: " + this.fullName + ", DateOfBirth: " + this.dateOfBirth + ", Major: " + this.major + ", GPA: " + this.gpa);
        
    }
    

    
    
    
}
