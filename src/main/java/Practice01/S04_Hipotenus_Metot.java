package Practice01;

import java.util.Scanner;

public class S04_Hipotenus_Metot {
    public static void main(String[] args) {
/*
       Hipotenüs hesaplayan bir kod yazınız
       Hipotenös formülü: Karekök(a*a + b*b)
    */

        Scanner input = new Scanner(System.in);
        System.out.println("a kenarının uzunlugunu giriniz.");
        double a = input.nextDouble();

        System.out.println("b kenarının uzunlugunu giriniz..");
        double b = input.nextDouble();

        System.out.println(hipotenusHesapla(a, b));


    }

    public static double hipotenusHesapla(double a, double b) {

        double hipotenus = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return hipotenus;

    }
}
