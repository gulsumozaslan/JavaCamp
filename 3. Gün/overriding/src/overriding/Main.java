package overriding;

public class Main {

	public static void main(String[] args) {

		BaseKrediManager[] baseKrediManager = new BaseKrediManager[] { new OgrenciKrediManager(),
				new OgretmenKrediManager(), new TarimKrediManager() };

		for (BaseKrediManager krediManager : baseKrediManager) {
			System.out.println(krediManager.hesapla(1000));
			
		}
	}

}
