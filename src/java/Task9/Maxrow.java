package java.Task9;

import java.util.Scanner;

public class Maxrow {
	 public static void MaxElement(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[i][j]>a[i][j+1]) {
					if(a[i][j]>a[i][j+2]) {
						System.out.println(" Max Element in Current Row"+a[i][j]);
					}else {
						System.out.println(" Max Element in Current Row"+a[i][j+2]);
					}
				}else if(a[i][j+1]>a[i][a.length-1]) {
					System.out.println(" Max Element in Current Row"+a[i][j+1]);
				}else {
					System.out.println(" Max Element in Current Row"+a[i][a.length-1]);
				}
			}
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of Array ");
	int size = sc.nextInt();
	int[][] arr = new int[size][size];
	System.out.println("Enter the values of Array");
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			arr[i][j] = sc.nextInt();
		} 
	}	MaxElement(arr);
	
}
}