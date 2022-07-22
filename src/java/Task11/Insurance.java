package java.Task11;

import java.util.*;

public class Insurance {
		String person,helth;
		String living,gender;
		int age;
		
		Scanner sc=new Scanner(System.in);
		
		void view() {
			
			System.out.println("Enter helth ");
			helth=sc.next();
				
			System.out.println("Enter person Name ");
			person=sc.next();
			
			System.out.println("Enter the person age ");
			age=sc.nextInt();
			
			System.out.println("Enter the living Area");
			living=sc.next();
				
			System.out.println("Enter the gender ");
			gender=sc.next();
			

			
			if((helth.equals("excellent"))&& age>=25 ||age<=35 && living.equals("city") && gender.equals("male")) {
				 
							System.out.println("permioum 40000");
						}
			
			else if((helth.equals("excellent")) && age>=25 ||age<=35 && living.equals("city") && gender.equals("female")) {
				
						System.out.println("permioum 30000");
			}
			
			else if((helth.equals("poor"))&& age>=25 ||age<=35 && living.equals("village")&& gender.equals("male")) {
				
				
						System.out.println("permioum 60000");
					}
				
			
			else {
				System.out.println("person is not insured");
			}
		}
			
		public static void main(String args[]) {
			Insurance i =new Insurance();
			i.view();
			
			
		}
}