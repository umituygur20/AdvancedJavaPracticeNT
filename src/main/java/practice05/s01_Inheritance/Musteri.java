package practice05.s01_Inheritance;

public class Musteri {
    String musteriAdi;
    int musteriNo;
    double hesapBakiyesi;

    @Override
    public String toString() {
        return  "\n\tMüşteri Adı: " + musteriAdi +
                "\n\tMüşteri No : " + musteriNo +
                "\n\tHesap Bakiyesi: " + hesapBakiyesi ;
    }

    public Musteri(String musteriAdi, int musteriNo, double hesapBakiyesi) {
        this.musteriAdi = musteriAdi;
        this.musteriNo = musteriNo;
        this.hesapBakiyesi = hesapBakiyesi;

    }

    public void paraYatirma(double para) {

        hesapBakiyesi += para;
        System.out.println("Hesabınıza " + para +" TL eklenmiştir.");
        System.out.println("Yeni hesap bakiyeniz :" +hesapBakiyesi + " TL 'dir.");
    }

    public void paraCekme(double para){
        if (hesapBakiyesi>=para){
            hesapBakiyesi-=para;
            System.out.println("Hesabınızdan " +para +" Çekilmiştir.");
        }else {
            System.out.println("Hesap bakiyeniz " +para +" çekmek için yetersizdir.");

        } System.out.println("Hesabınızda " +hesapBakiyesi+ " Var.");

    }
}
