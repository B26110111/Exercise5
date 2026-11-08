package main.java;

public class araba {
private String marka;
private String model;
private double günlükucret;
private boolean kiradaMi;

//constructor
araba(String marka, String model, double günlükucret, boolean kiradaMi){
this.marka=marka;
this.model=model;
this.günlükucret=günlükucret;
this.kiradaMi=kiradaMi;

}

void bilgileriGoster() {

    System.out.println("Marka: " + marka);
    System.out.println("Model: " + model);
    System.out.println("Gunluk Ucret: " + günlükucret + " TL");

    if (kiradaMi) {
        System.out.println("Durum: Kirada");
    } else {
        System.out.println("Durum: Musait");
    }

    System.out.println("-------------------------");
}

//Araç kiralama metodu
void kirala() {

    if (kiradaMi == false) {

        kiradaMi = true;
        System.out.println(marka + " " + model + " basariyla kiralandi.");

    } else {

        System.out.println("Bu arac zaten kiralanmis!");
    }
}


// Araç teslim etme metodu
void teslimEt() {

    if (kiradaMi == true) {

        kiradaMi = false;
        System.out.println(marka + " " + model + " basariyla teslim alindi.");

    } else {

        System.out.println("Bu arac zaten musait!");
    }
}


// Kira bedeli hesaplama metodu
double kiraBedeliHesapla(int gun) {

    if (gun <= 0) {
        return 0;
    }

    return günlükucret * gun;
}
}



