/* Ticket Booking System.

Login
Exit 

Login => mobile number 

1.1 	Book Ticket { Gold Silver Diamond -Qty } 
1.2	View Booked Tickets
1.3	Available Tickets 
1.4       Logout

Three Types of Ticket , Diamond - Rs.200 , Gold - Rs.150 , Silver -Rs.100 	
One user can book max 7 Tickets.
Total 60 tickets we have 20 Diamond , 20 Gold and 20 Silver.
User can identified by mobile number. 
*/
package java.Task5;

import java.util.*;
public class Tic {
	int a=1;
	Scanner snr = new Scanner(System.in);
	long number[]= new long[a];
	long num1;
	
	String password[] = new String[2];
	String pass1 = new String();
	int choice;
	int gold[] = new int[a];
	int silver[]= new int[a] ;
	int diamond[]= new int[a],bookTicket ;
	int totalgold =20,totalsilver = 20,totaldiamond =20,totalTicket = 60;
	int goldPrice = 150, silverPrice = 	100 ,diamondPrice=200,finalPrice ;
	int firstGold=0,firstsilver=0,firstdiamond=0;
	
	public Tic() {
		long num2;
		System.out.println("Please Sign up");
		for(int i=0;i<number.length;i++) {
			System.out.println("Enter number");
			number[i] = snr.nextLong();
			num2=number[i];	
			
			for(int j=0;j<number.length;j++) {
				if(i==j) {
					System.out.println("Enter Password");
					password[i] = snr.next();
					break;
				}else {
					if(num2==number[j]) {
					System.out.println("this number is already ragister...");
					number[i]=0;
					password[i]=null;
					break;
					}
					
				}
				
			
			}
		}
	}
	
	
	public void getData() {
		
		int flag1=0;
		while(flag1!=1) {
			
		System.out.println("Please Login:");
		System.out.println("Enter number");
		num1= snr.nextLong();
		
		System.out.println("Enter Password");
		pass1 = snr.next();
		
		for(int i=0;i<number.length;i++) {
			
			if(number[i] == num1 &&  password[i].equals(pass1) == true) {
				
				System.out.println("1. Book ticket");
				System.out.println("2. View Booked Ticket");
				System.out.println("3. Available Tickets");
				System.out.println("4. Logout");
				
				System.out.println("Enter Choice:");
				choice = snr.nextInt();
				switch(choice) {
				case 1:
					System.out.println("You are in Ticket booking section........");
					System.out.println("Available Total ticket:"+totalTicket);
					System.out.println("Available Gold ticket:"+totalgold);
					System.out.println("Available Silver ticket:"+totalsilver);
					System.out.println("Available Diamond ticket:"+totaldiamond);
					int flag =1;
					int total = silver[i]+gold[i]+diamond[i];
					while(flag!=0) {
						System.out.println("1. Silver :");
						System.out.println("2. Gold :");
						System.out.println("3. Diamond :");
						System.out.println("Enter your Choice:");
						int choice1 = snr.nextInt();
						switch(choice1) {
						case 1:
							
							firstsilver=0;
							System.out.println("Enter Number of silver ticket you want:");
							firstsilver = snr.nextInt();
							silver[i] = silver[i]+firstsilver;
							
							break;
						case 2:
							firstGold=0;
							System.out.println("Enter Number of gold ticket you want:");
							firstGold = snr.nextInt();
							gold[i]= gold[i]+firstGold;
							total = total+firstGold;
							break;
						case 3:
							firstdiamond=0;
							System.out.println("Enter Number of silver ticket you want:");
							firstdiamond =snr.nextInt();
							diamond[i]=diamond[i]+firstdiamond;
							break;
						case 4:
							System.exit(0);
						default:
							System.out.println("Invalid Value");
						}
						
						
						if(silver[i]+gold[i]+diamond[i]>=7) {
							System.out.println("Maximum Limit 7");
							if(choice1==1) {
								silver[i] = silver[i]-firstsilver;
								System.out.println("Your Already Book ticket are "+silver[i]+" SILVER "+gold[i]+" GOLD "+diamond[i]+" DIAMOND ");
							}else if(choice1==2) {
								gold[i]= gold[i]-firstGold;
								System.out.println("Your Already Book ticket are "+silver[i]+" SILVER "+gold[i]+" GOLD "+diamond[i]+" DIAMOND ");
							}else if(choice1==3) {
								diamond[i]=diamond[i]-firstdiamond;
								System.out.println("Your Already Book ticket are "+silver[i]+" SILVER "+gold[i]+" GOLD "+diamond[i]+" DIAMOND ");
							}
							System.out.println("Please Rebook Ticket");
						}else {
							
						totalTicket = totalTicket -  firstsilver -firstGold - firstdiamond;
						totalgold = totalgold - firstGold;
						totalsilver = totalsilver - firstsilver;
						totaldiamond = totaldiamond - firstdiamond;
						System.out.println("Test 2");
						}	
						
						System.out.println("Enter 0 for exit ");
						flag =snr.nextInt();
						if(flag==0) {	
							break;
						}
					}
					break;
					
				case 2:
					System.out.println("You are in view booked  Ticket section........");
					System.out.println(" Silver ticket:"+silver[i]);
					System.out.println(" Gold ticket:"+gold[i]);
					System.out.println(" Diamond ticket:"+diamond[i]);
					break;
				case 3:
					System.out.println("You are in Available Ticket section........");
					System.out.println("Available Total ticket:"+totalTicket);
					System.out.println("Available Silver ticket:"+totalsilver);
					System.out.println("Available Gold ticket:"+totalgold);
					System.out.println("Available Diamond ticket:"+totaldiamond);
					break;
				case 4:
					break;
				default :
					System.out.println("Invalid value");
				}
				}
			
		  }
		}
		System.out.println("Enter 1 for exit");
		flag1 =snr.nextInt();
		if(flag1==1) {
			System.out.println("Invalid number and password.....");
			System.exit(0);
		}
		
		
	}
	public static void main(String arg[]) {
		
		Tic tc = new Tic();
		tc.getData();
		
	}
}