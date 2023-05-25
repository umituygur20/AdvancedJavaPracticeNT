package Practice01;

import java.util.Scanner;

public class S06_Regex_Ve_StringManipulations {
    public static void main(String[] args) {
    /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız.
       Ad ayrı, soyad ayrı sekilde ekrana yazdırınız.
       Örnek:
          Ad: Ali
          Soyad: Can
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adinizi ve soyadınız giriniz.");
        String adSoyad = scan.nextLine();

      String ad = adSoyad.split(" ")[0];
      String soyAd =adSoyad.split(" ")[1];
        System.out.println("ad = " + ad);
        System.out.println("soyAd = " + soyAd);



        //\s++ tüm Space'ler için

//        String ad=adSoyad.trim().replaceAll("\\s+", " ").split(" ")[0];
//        String soyAd=adSoyad.trim().replaceAll("\\s+", " ").split(" ")[1];
//
//        System.out.println("ad " +ad+"\n"+"soyad :"+soyAd);
    }
}
