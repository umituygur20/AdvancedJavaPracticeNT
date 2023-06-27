package practice05.s04_polymorphism;

public class MedyaRunner {

    public static void main(String[] args) {

// Constructor kalıptan obje üretir.Constructor bir object oluşturulduğunda çalışır.
        MedyaOynatici medyaOynatici = new MedyaOynatici("Ses dosyasi.mp3");
        System.out.println(medyaOynatici);

        MedyaOynatici mo = new MedyaOynatici("Video dosyasi.avi");
        System.out.println(mo);

        medyaOynatici.setDosyaAdi("Sadece Sitem.mp3");
        System.out.println(medyaOynatici);

        System.out.println(medyaOynatici.getDosyaAdi());

        SesDosyalari ses = new SesDosyalari("mp3");
        ses.oynat();
    }
}
