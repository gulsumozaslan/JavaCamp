package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		int sayi=28;
		int toplam=0;
		int kalan=0;
		
		for (int i = 1; i < sayi; i++) {
			kalan = sayi%i;
			if (kalan == 0) {
				toplam=toplam+i;
				
			}
			
		}
		if (sayi == toplam) {
			System.out.println(sayi +" : Mükemmel sayıdır");
		}else {
			System.out.println(sayi +" : Mükemmel sayı değildir");
		}


		

	}

}
