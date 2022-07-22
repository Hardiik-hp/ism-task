/*Student 
			-studentId 
			-name 
			-email
			-password 
			
	when any student registered studentId will automatically assign 
	an unique number. 
	name email and password will input by student. 
	
    create two methods 1) input 2) print 
    
    
    111111	ram	ram@gmail.com	ram123 
 */
package java.Task2;
import java.util.*;

public class Student {
	int studentID;
	String name, email, password;
	Student(){
		studentID = (int)(Math.random()*10000000);
	}
	
	void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		name =sc.next();
		System.out.println("Enter Email");
		email = sc.next();
		System.out.println("Enter Password");
		password = sc.next();
		sc.close();
	}
	void print() {
		System.out.println("StudentId\tName\tEmail\tPassword");
		System.out.println(studentID+"\t\t"+name+"\t"+email+"\t"+password);
	}
	public static void main(String[] args) {
		Student s1= new Student ();
		s1.input();
		s1.print();
	}
	
}