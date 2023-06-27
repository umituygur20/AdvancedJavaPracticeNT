package practice05.s04_polymorphism;

public class SesDosyalari extends MedyaOynatici{


    public SesDosyalari(String dosyaAdi) {
        super(dosyaAdi);
    }

    @Override
    public void oynat() {
        System.out.println("Ses dosyasi oynatılıyor.");
    }

    @Override
    public void durdur() {
        System.out.println("Ses dosyasi durduruldu.");
    }
}
