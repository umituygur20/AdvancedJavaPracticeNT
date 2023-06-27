package practice05.s04_polymorphism;

public class VideoDosyalari extends MedyaOynatici{


    public VideoDosyalari(String dosyaAdi) {
        super(dosyaAdi);
    }

    @Override
    public void oynat() {
        System.out.println("Video dosyasi oynatılıyor.");
    }

    @Override
    public void durdur() {
        System.out.println("Video dosyasi durduruldu.");
    }
}
