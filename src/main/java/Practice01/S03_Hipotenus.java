package Practice01;

import java.text.DecimalFormat;

public class S03_Hipotenus {
    public static void main(String[] args) {
  /*
       Hipotenüs hesaplayan bir kod yazınız
       Hipotenös formülü: Karekök(a*a + b*b)
    */

        int a = 12;
        int b = 5;

        double hipotenus = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));


        System.out.println(hipotenus);

    }
}
