package java.Task22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File("E:\\Userbackup.txt");
		Scanner sc = new Scanner(System.in);
		ArrayList<user> users = new ArrayList<>();
		int flag = 1;
		try {
			FileOutputStream writeData = new FileOutputStream("E:\\Userbackup.txt");
			//while (true) {
			for(int i=0;i<5; i++) {
				user user = new user();
				System.out.println("please enter name and salary");
				user.setName(sc.next());
				user.setSalary(sc.nextInt());
				users.add(user);
			}

				System.out.println("exit for 0");
				flag = sc.nextInt();
				///if (flag == 0) {
					///break;
			
			//}//while close
			ObjectOutputStream o = new ObjectOutputStream(writeData);
			o.writeObject(users);
			o.close();
			//}
			} catch (IOException e) {
			e.printStackTrace();
		}
		FileInputStream fis = new FileInputStream("E:\\Userbackup.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<user> clubs = (List<user>) ois.readObject();
		ois.close();
		for (user q : clubs) {
			
			System.out.println(q);
		
		}

	}
}

class user implements Serializable {
	private int userid;
	private String name;
	private int salary;

	public user() {
		this.userid = (int) (Math.random() * 10000);
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return this.userid + "	" + this.name + " 	" + this.salary;
	}

}