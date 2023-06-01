package Practice01;

import java.util.Scanner;

public class S07_StringManipulations {
    public static void main(String[] args) {
 /*
        Kullanıcıdan adını, ikinci adını ve soyadını tek bir satırda girmesini isteyin.
        Ardından ikinci adın ve soyadın ilk karakterini yazdırın.
        Örnek: Mark Hansel Twain ==> HT
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adinizi,ikindi adinizi ve Soyadınızı giriniz.");
        String str = scan.nextLine();

        String ikinciAd = str.split(" ")[1].substring(0, 1).toUpperCase();
        String soyAd = str.split(" ")[2].substring(0, 1).toUpperCase();
        System.out.println(ikinciAd + soyAd);

        //başka bir yol


    }
}
