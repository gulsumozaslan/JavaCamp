package polymorphismDemo;

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
		
	}

	public void add() {
		System.out.println("Müşteri eklendi");
		this.logger.log("log mesajı");
	}
	
	public void delete() {
		System.out.println("Müşteri silindi");
		this.logger.log("Loglandı");
	}

}
