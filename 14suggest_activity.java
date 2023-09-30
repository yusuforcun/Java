package javadenemeeclipse;
import java.util.*;
public class etkinlikönerme14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program starting");
		Scanner scan = new Scanner(System.in);
		double sıcaklık= scan.nextDouble();
		if (sıcaklık>0 && sıcaklık<25) {
			System.out.println("sg donmussun");
		}else if (sıcaklık>=25 || sıcaklık<50) {
			System.out.println("go to deniz");
		}
	}

}
