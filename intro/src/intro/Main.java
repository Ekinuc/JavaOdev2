package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself
		String internetSubeButonu = "�nternet �ubesi";
		//int sadece tam say� ondal�kl� i�im double kullan�labilir.
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� resmi");
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		}
		
		else {
			System.out.println("Dolar e�it resmi");
		}
		
		
		String kredi1 ="H�zl� Kredi";
		String kredi2 ="Mutlu Emekli Kredi";
		String kredi3 ="Konut Kredisi";
		String kredi4 ="�ift�i Kredi";
		String kredi5 ="Msb Kredi";
		String kredi6 ="Meb Kredisi";
		String kredi7 ="K�lt�r Bakanl��� kredisi";
		
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		
		String[] krediler = 
			{
					"H�zl� Kredi",
					"Mutlu Emekli Kredi",
					"Konut Kredisi",
					"�ift�i Kredi",
					"Msb Kredi",
					"Meb Kredisi",
					"K�lt�r Bakanl��� kredisi"
			};
		//foreach
		for (String kredi :krediler) {
			System.out.println(kredi);
		}
		
		for(int i =0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		
		
				
		
		
		
	}

}
