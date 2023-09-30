package javadenemeeclipse;
import java.util.Scanner;
public class degiskengirme3 {

	public static void main(String[] args) {
		System.out.println("program starting 3");
		Scanner input= new Scanner (System.in);
		int a ,b ;
		System.out.print("a sayisini  giriniz :");
		a =input.nextInt();
		System.out.print("b sayisini giriniz : ");
		
		b = input.nextInt();
		System.out.println("A sayisi = "+a +" \nB sayisi : "+b);
		double c ;
		System.out.print("Double turunde birsey giriniz : ");
		c = input.nextDouble();	
		//str çalışıyor ancak üstteki kodlar olmamalı
		String str ;
		str = input.nextLine();
		System.out.println(str);
		
		
	}

}
