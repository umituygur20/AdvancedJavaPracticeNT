package practice05.s01_Inheritance;

public class KurumsalMusteriler extends Musteri {
    String vergiNo;
    String sirketAdi;

    public KurumsalMusteriler(String musteriAdi, int musteriNo, double hesapBakiyesi,String vergiNo,String sirketAdi) {
        super(musteriAdi, musteriNo, hesapBakiyesi);

    }

    @Override
    public String toString() {
        return "KurumsalMusteriler "+ super.toString()+
                "\n\tVergi No: " + vergiNo +
                "\n\tŞirket Adı: " + sirketAdi ;

    }
}
