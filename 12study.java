package javadenemeeclipse;
import java.util.Scanner;
public class sinifgecme12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program starting 12");
		Scanner scan=new Scanner(System.in);
		double note1,note2,note3,ort;
		System.out.println("note 1");
		note1= scan.nextDouble();
		System.out.println("note2");
		note2=scan.nextDouble();
		System.out.println("note3");
		note3=scan.nextDouble();
		ort=(note1+note2+note3)/3 ;
		if (ort>=50) {
			System.out.println("geçtin");
		}else {
			System.out.println("enai"+ort);
		}
		
		
		
		
		
		
	}

}
