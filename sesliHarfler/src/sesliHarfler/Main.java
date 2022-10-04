package sesliHarfler;


public class Main {

	public static void main(String[] args) {
		
		
		char harf='E';
		char[] sesliHarfler = {'A','E','I','İ','O','Ö','U','Ü'};
		boolean sesliMi =false;
		
		for (int i = 0; i < sesliHarfler.length; i++) {
			if (sesliHarfler[i]==harf) {
				sesliMi=true;
			}
		}
		if (sesliMi) {
			System.out.println("Harf seslidir");
		}else {
			System.out.println("Harf sesli değildir");
		}
		
//		switch (harf) {
//		case 'A':
//		case 'I':
//		case 'O':
//		case 'U':
//			System.out.println("Kalın sesli harf");
//			break;
//		case 'E':
//		case 'İ':
//		case 'Ö':
//		case 'Ü':
//			System.out.println("İnce sesli harf");
//
//		default:
//			System.out.println("Sesli harf değildir");
//		}
	}

}
