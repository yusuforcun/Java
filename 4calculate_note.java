package javadenemeeclipse;
import java.util.Scanner ;
public class notorthesap4 {

	public static void main(String[] args) {
		System.out.println("program starting 4");
		Scanner input= new Scanner(System.in);
		int note1,note2,note3,ort;
		System.out.print("please login note 1 :");
		note1 = input.nextInt();
		System.out.print("please login note 2 :");
		note2= input.nextInt();
		System.out.print("please login note 3 ");
		note3=input.nextInt();
		ort=(note1+note2+note3)/3 ;
		System.out.println("not 1 :"+note1+"not2 :"+note2+"not3 :"+note3+"\nortalama:"+ort);
	
	}

}
