package javadenemeeclipse;
import java.util.Scanner;
public class switchcase9 {

	public static void main(String[] args) {
		System.out.println("program starting 9");
		Scanner scan=new Scanner(System.in);
		System.out.print("please sayi ");
		int sayi = scan.nextInt();
		switch(sayi) {
		case 1 :
			System.out.println("sayi =1");
			break;
		case 2 :
			System.out.println("sayi = 2");
			break ;
		case 3 :
			System.out.println("sayi = 3");
			break;
		default :
			System.out.println("gecersiz sayi");
		
		}
	}

}
