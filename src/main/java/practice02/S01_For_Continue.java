package practice02;

import java.util.Scanner;

public class S01_For_Continue {
    public static void main(String[] args) {
  /*
      Kullanıcıdan 5 adet sayı isteyiniz
      Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
    */
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen 5 adet sayı giriniz");

        int toplam = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Birinci tam sayiyi giriniz");
            int sayi = input.nextInt();

            if (sayi>5 && sayi<10){
                System.out.println("Girdiğiniz sayi 5 ile 10 arasinda olduğundan toplama islemine dahil edilmedi.");
                continue;
            }

            toplam += sayi;

        }
        System.out.println(" Toplam = " +toplam);
    }

}
