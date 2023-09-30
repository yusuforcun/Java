package javadenemeeclipse;
import java.util.*;
public class hesapgirme11 {

	public static void main(String[] args) {
		System.out.println("program starting 11");
		Scanner scan = new Scanner(System.in);
		String ka , parola;
		System.out.print("k adi gir");
		ka=scan.nextLine();
		System.out.print("parola ");
		parola=scan.nextLine();
		if (ka.equals("java")&&parola.equals("ıjak")){
			System.out.println("succesful");
			
		}else {
			System.out.println("wrong login");
		}
		
		
		
	}

}
