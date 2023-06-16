package practice03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class S01_DateTime_Gunler {
    /*
           Kullanıcıdan alınan bir tarihin haftanın hangi gününe denk geldiğini bulan bir program yazmanız isteniyor.
           Kullanıcıdan yıl, ay ve gün bilgilerini alarak, tarihin hangi gün olduğunu bulan bir Java programı yazın.
           Sonuç olarak, tarihin haftanın hangi gününe denk geldiğini Türkçe olarak ekrana yazdırın.
       */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Yıl, ay ve gün bilgisini sayısal olarak giriniz .");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate tarih = LocalDate.of(year, month, day);
        String haftaninGunu = tarih.getDayOfWeek().name();
//        System.out.println(haftaninGunu);

        switch (haftaninGunu) {
            case "SUNDAY":
                System.out.println("Girdiğiniz tarih Pazar gününe denk gelmektedir.");
                break;
            case "MONDAY":
                System.out.println("Pazartesi");
                break;
            case "TUESDAY":
                System.out.println("Salı");
                break;
            case "WEDNESDAY":
                System.out.println("Çarşamba");
                break;
            case "THURSDAY":
                System.out.println("Perşembe");
                break;
            case "FRIDAY":
                System.out.println("Cuma");
                break;
            case "SATURDAY":
                System.out.println("Cumartesi");
                break;

            // 2. YOL
//            DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(new Locale("tr"))
//            System.out.println("Girilen tarih: " + tarih.format(formatter).split(" ")[3]);
        }




    }

    }



