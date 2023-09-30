package javadenemeeclipse ;

import java.util.*;

public class ucakbileeti13{
	public static void main(String[]Args) {
		Scanner scan = new Scanner(System.in);
		int km ,yas,tip;
		System.out.print("km gir");
		km = scan.nextInt();
		System.out.print("yas gir");
		yas = scan.nextInt();
		System.out.print("tip gir");
		tip = scan.nextInt();
		
		double normalfiyat ,tipind, yasind ;
		
		
		if (km>0 && yas>0 && (tip==1 || tip==2)) {
			System.out.println("girdiler dogru");
			normalfiyat = km*0.10 ;
			if (yas<12) {
				yasind = normalfiyat*0.5 ; //ind orranı hesaplıyor
				normalfiyat = normalfiyat - yasind ;// çıkartıyor sonuctan
			}else if(yas>=12 && yas<=24) {
				yasind=normalfiyat*0.10 ;
				normalfiyat-=yasind ;
			}else if (yas>=65) {
				yasind=normalfiyat*0.30 ;
				normalfiyat-=yasind ;
			}else {
				System.out.println("yok ");
			}
			
			
			if(tip==2) {
				System.out.println("tip indirimi");
				tipind=normalfiyat*0.20 ;
				normalfiyat=(normalfiyat-tipind)*2 ;
			}else {
				System.out.println("tip indirimi yok");
			}
			
			System.out.println("fiyat : "+normalfiyat);
			
		}else {
			System.out.println("girdiler yanlis");
		}
			
	}
}