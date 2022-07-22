/* class Levis 
 		name
 		price
 		category 
 		tax 
 		amount    
   	methods 
   		input 
   		print 
   		
   	user can purchase any item from levis . when user purchase they input all the details
   	of item for levis , tax need to calculate automatically. 
   	tax is based on price of levis item. 
   	like, if category is men then tax is 15% 
   	         category is women then tax is 10% 
   	         category is student then tax is 5% 
   	         
   	once all input done print all response. 
   	
   	ex: 
   	input:
   	    name : denim jeans  
   	    price : 1500
   	    category : men 
   	    
   	output : 
   	  denim jeans 	1500	men 225  1725
 */
package java.Task3;

import java.util.Scanner;

public class Levis {
	String name;
	int price;
	int category;
	double tax;
	double amount;
	String s;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select a Category you want");
		System.out.println("1) Men");
		System.out.println("2) Female");
		System.out.println("3) Student");
		category = sc.nextInt();
		System.out.println(" Enter Name of Levis");
		name = sc.next();
		System.out.println(" Enter Price of "+name);
		//name = sc.next();
		price = sc.nextInt();
	}

	void print() {
		System.out.println("Name\tPrice\tCategory\tTax\tTotal");
		System.out.println(name + "\t" + price + "\t"+s+"\t\t"+tax+"\t"+amount);
		
	}

	Levis() {
		input();
		if(category == 1) {
			tax = price * 0.15;
			s = "Men";
		}else if(category==2) {
			tax = price * 0.10;
			s = "Female";
		}else {
			tax = price * 0.5;
			s = "Student";
		}
		System.out.println("---> " + tax);
		amount = price + tax;
	}

	public static void main(String[] args) {
		Levis L1 = new Levis();
		L1.print();
		}
}
