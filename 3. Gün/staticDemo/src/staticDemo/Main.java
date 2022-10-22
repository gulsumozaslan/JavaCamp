package staticDemo;

public class Main {

	public static void main(String[] args) {

		ProductManager productManager = new ProductManager();

		Product product = new Product();
		product.name = "Bilgisayar";
		product.price = 1599.99;
		productManager.add(product);
	}

}
