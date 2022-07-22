package java.Task20;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCount {

	public static void main(String[] args) throws IOException {
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a File Path");
		String path = sc.next();
		
		File directory=new File(path);
		int fileCount=directory.list().length;
		System.out.println("File Count:"+fileCount);
	}
}
