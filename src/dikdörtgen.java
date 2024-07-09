import java.util.Scanner;

public class dikdörtgen {
	public static void main(String[] args) {
		//Dikdörtgen “sınıfının” alan ve çevresini öğrendiğiniz konuları kullanarak hesaplayın
		Scanner scan=new Scanner(System.in);
		
		int kenar1,kenar2;
		System.out.println("kenar1 değerini giriniz:");
		kenar1=scan.nextInt();
		System.out.println("kenar2 değerini giriniz");
		kenar2=scan.nextInt();
		
		System.out.println("dikdörtgenin alanı"+ kenar1*kenar2);
		System.out.println("dikdörtgenin çevresi"+ (kenar1*2+kenar2*2));
	}

}
