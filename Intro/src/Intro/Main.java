package Intro;

public class Main {

	public static void main(String[] args) { // main java projesinin baslangini ve dallandigi yerdir
		//camelCase : desiken adlari kück harfle baslar. birlesik kelimeler ise diger kelimelerin bas harfi büyük olur
		//Don't repeat yourself
		String internetSubeButonu ="Internet Subesi";
		double dolarDun = 8.15;   // ondalikli sayi
		double dolarBugun = 8.15;
		int vade =36 ;  // tamsayi
		boolean dustuMU = false;

		System.out.println(internetSubeButonu);
		
		if (dolarBugun<dolarDun) {
			System.out.println("Dolar düstü resmi");// Frontend'de  ilgili imaje görünmesi saglanacak
		}
		else if (dolarBugun==dolarDun) {
			System.out.println("Dolar degismedi");	// Frontend'de ilgili imaje görünmesi saglanacak
		}
		else {
			System.out.println("Dolar artti resmi");	// Frontend'de ilgili imaje görünmesi saglanacak
		}
	
		
		String[] krediler = 
			{ 
				"Hizli Kredi", 
				"Emekli Kredisi" ,
				"Konut Kredisi",
				"dfdfdf"
			};
		
		//foreach
		for (String kredi:krediler) {
			System.out.println(kredi);
		}
		
		//for diger yazimi
		for (int i=0; i<krediler.length ; i++) {
			System.out.println(krediler[i]);
		}
		
		//for diger yazimi
		for (int i=0; i<krediler.length ; i=i+1) {
			System.out.println(krediler[i]);
		}
		
		
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		System.out.println(sayi1);	
		
		int [] sayilar1 ={1,2,3,4,5};
		int [] sayilar2 ={10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]= 100;
		System.out.println(sayilar1[0]);	
		 
		String sehir1 = "Ankara";
		String sehir2 = "Istanbul";
		sehir1 =sehir2;
		sehir2="Izmir";
		System.out.println(sehir1);	
		
		
	}

}
