package main.java;

public class Main {

	public static void main(String[] args) {
		
		// Görev 4 - Araç nesnelerini oluşturma

        araba arac1 = new araba("Toyota", "Corolla", 1500, false);

        araba arac2 = new araba("Renault", "Clio", 1200, false);

        araba arac3 = new araba("BMW", "320i", 3000, true);


        // Görev 5 - İşlemler

        System.out.println("===== BASLANGIC ARAC BILGILERI =====");

        // 1. Üç aracın bilgilerini yazdırma

        arac1.bilgileriGoster();
        arac2.bilgileriGoster();
        arac3.bilgileriGoster();


        // 2. Birinci aracı kiralama

        System.out.println("\n===== ARAC KIRALAMA =====");

        arac1.kirala();


        // 3. Birinci aracı tekrar kiralamayı deneme

        System.out.println("\n===== TEKRAR KIRALAMA =====");

        arac1.kirala();


        // 4. İkinci aracın 5 günlük kira bedelini hesaplama

        System.out.println("\n===== KIRA BEDELI HESAPLAMA =====");

        double toplamTutar = arac2.kiraBedeliHesapla(5);

        System.out.println("Renault Clio 5 gunluk kira bedeli: "
                + toplamTutar + " TL");


        // 5. Üçüncü aracı teslim etme

        System.out.println("\n===== ARAC TESLIM =====");

        arac3.teslimEt();


        // 6. Araçların güncel durumlarını gösterme

        System.out.println("\n===== GUNCEL ARAC DURUMLARI =====");

        arac1.bilgileriGoster();
        arac2.bilgileriGoster();
        arac3.bilgileriGoster();

    }


	}


