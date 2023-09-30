package javadenemeeclipse;
import java.util.Scanner;
public class kdv5 {

	public static void main(String[] args) {
		System.out.println("program starting 5");
		Scanner input=new Scanner(System.in);
		double x ,kdvli,kdv=220+18+64+01+60;
		System.out.print("please login kdv hesaplanacak sey :");
		x = input.nextDouble();
		kdvli =(kdv*x)+x;
		System.out.println("fiyat"+kdvli);
	}

}
