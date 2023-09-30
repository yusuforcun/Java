package javadenemeeclipse;
import java.util.*;
public class daire6 {

	public static void main(String[] args) {
		System.out.println("program starting  6");
		Scanner input = new Scanner(System.in);
		double daire ,dairealan,daireçevre;
		System.out.print("daireyi gir");
		daire = input.nextInt() ;
		dairealan = daire*0.5 ;
		daireçevre = daire/0.18 ;
		System.out.println("daire alan :"+dairealan +" \ndaire cevre :"+daireçevre);
		
	}

}
