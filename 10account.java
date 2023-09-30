package javadenemeeclipse;
import java.util.Scanner;
public class hesap10 {

	public static void main(String[] args) {
		System.out.println("program starting 10");
		Scanner input = new Scanner(System.in);
		String islem ;
		int sayi1 ,sayi2 ;
		double ort ;
		System.out.print("toplama-cikarma-carpma-bolme  :");
		islem = input.nextLine();
		switch(islem){
			case "toplama":
				System.out.println("toplama islemi secildi");
				System.out.print("birinci sayi :");
				sayi1= input.nextInt();
				System.out.print("ikinci sayi :");
				sayi2=input.nextInt();
				ort = sayi1+sayi2;
				System.out.println("toplam :"+ort);
			
			case "cikarma" :
				System.out.println("cikarma islemi secildi ");
				System.out.print("birinci sayi");
				sayi1=input.nextInt();
				System.out.print("ikinci sayi");
				sayi2=input.nextInt();
				ort=sayi1-sayi2 ;
				System.out.println("cıkarılmıs :"+ort);
				
			case "carpma":
				System.out.println("carpma islemi secildi ");
				System.out.print("birinci sayi");
				sayi1=input.nextInt();
				System.out.print("ikinci sayi");
				sayi2=input.nextInt();
				ort=sayi1*sayi2 ;
				System.out.println("carpilmis :"+ort);
			case "bolme" :
				System.out.println("bolme islemi secildi ");
				System.out.print("birinci sayi");
				sayi1=input.nextInt();
				System.out.print("ikinci sayi");
				sayi2=input.nextInt();
				ort=sayi1/sayi2 ;
				System.out.println("bolunmus :"+ort);
				
			default:
				System.out.println("ZORTTTTTTTTTTTTT");
				
				
				
		}
		
		
	}

}
