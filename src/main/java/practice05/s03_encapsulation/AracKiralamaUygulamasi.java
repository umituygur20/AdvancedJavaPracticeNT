package practice05.s03_encapsulation;

public class AracKiralamaUygulamasi {
    public static void main(String[] args) {

        Arac arac1 = new Arac("Mercedes","EQC 400","Elektrikli",3500000);
        //Constructor ile objemizi oluşturmuş olduk.

        arac1.setGunlukKira(600);// setter methodu calıştirip değeri set Ettik !. // 600 . eski fiyat 3.500.000'tl idi.:(
        System.out.println(arac1);

        System.out.println(arac1.getMarka());// get kullanarak arac markası aldık .// Mercedes

    }
}
