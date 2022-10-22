package sayiBulma;


public class Main {

	public static void main(String[] args) {
		
		int[] sayilar = new int[]{1, 2, 3, 4, 5, 35, 23, 10};
		int aranacakSayi = 4;
		boolean varMi = false;
		
		for (int i = 0; i < sayilar.length; i++) {
			if (aranacakSayi == sayilar[i]) {
				varMi = true;
				break;
			}
		}
		/*for (int sayi : sayilar) {
			if (aranacakSayi == sayi) {
				varMi = true;
				break;
				
			}
		} */
		
		
		if ( varMi == true) {
			System.out.println("Aradığınız " +aranacakSayi +" sayısı dizilerde mevcuttur");
		}
		else {
			System.out.println("Aradığınız " +aranacakSayi +" sayısı dizilerde mevcut değildir");
		}

	}

}
