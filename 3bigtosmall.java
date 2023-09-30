package javadenemeeclipse;

import java.util.Scanner;

public class buyuktenkucuge15 {
	public static void main(String[]Args) {
		System.out.println("program starting");
		//a>b>c
		//a>c>b
		//a=b=c
		Scanner scan = new Scanner(System.in);
		int a =scan.nextInt();
		int b =scan.nextInt();
		int c =scan.nextInt();
		if (a>b&& b>c) {
			System.out.println("a>b>c");
		}else if (a>c && c>b) {
			System.out.println("a>c>b");
		}

	}
	

}
