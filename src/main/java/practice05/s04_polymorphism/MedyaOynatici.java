package practice05.s04_polymorphism;

public class MedyaOynatici {

    private String dosyaAdi;


    public MedyaOynatici(String dosyaAdi) {

        this.dosyaAdi = dosyaAdi;
        System.out.println(dosyaAdi +" adinda bir dosya oluşturuldu.");
    }

    public void oynat() {
        System.out.println("Dosya Oynatılıyor.");
    }
    public void durdur() {
        System.out.println("Dosya Durduruldu.");
    }


    @Override
    public String toString() {

        return "Dosya Adi\t= " + dosyaAdi;
}

    public String getDosyaAdi() {
        return dosyaAdi;
    }

    public void setDosyaAdi(String dosyaAdi) {
        this.dosyaAdi = dosyaAdi;
    }
}
