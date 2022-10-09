package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		//Değişken isimlendirmeleri javada camelCase yazılır
		
		String metin = "İlginizi çekebilir ";
		System.out.println(metin);
		
		//Array
		
		double total=0;
		double[] myList = {7.2,8.3,9.4,10};  //Bu yöntemle double[] myList = new double[4]; aynı şey. {} arkada new'i oluşturur.
		double max = myList[0];
		
		
		for (double number : myList) {
			if (max<number) {
				max=number;
			}
			total+=number;
		}

		System.out.println("Total:" +total);
		System.out.println("Max:" +max);
		
	
	}

}
