package abstractClasses;

public abstract class GameCalculator {
	
	public abstract void hesapla(); //classların hesapla metodunu override etmeleri gerekir 
	
	public final void gameOver() {  //Final keywordü ile bu metod değiştirilemez
		System.out.println("Oyun bitti");
	}

}
