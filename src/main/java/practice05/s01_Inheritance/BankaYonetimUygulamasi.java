package practice05.s01_Inheritance;

import java.time.LocalDate;

public class BankaYonetimUygulamasi {

    public static void main(String[] args) {
        LocalDate dogumtarihi = LocalDate.of(1990, 1, 8);

        BireyselMusteriler bm = new BireyselMusteriler(
                "Ali Can",
                123131317,
                2000,
                "48103092850",
                dogumtarihi);


        System.out.println(bm.toString());
KurumsalMusteriler km = new KurumsalMusteriler("Ali CANCAN",5155,2000,"1999552","TECHPRO EDUCATION");
        bm.paraCekme(2000);
        System.out.println("--------------------------------------------------");
        System.out.println(km.toString());
        km.paraYatirma(2000);
    }
}
