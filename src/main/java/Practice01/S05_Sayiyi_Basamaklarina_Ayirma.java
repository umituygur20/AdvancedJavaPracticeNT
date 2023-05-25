package Practice01;

public class S05_Sayiyi_Basamaklarina_Ayirma {
    public static void main(String[] args) {
  /*
        Bir tamsayıyı basamaklarına ayıran bir kod yazınız.
        İpucu: / ve % kullanınız
        Sayı: 12345
        Çıktı: 1
               2
               3
               4
               5
    */

        int sayi = 12345;

        int birler = sayi%10;       //12345

        int onlar  = (sayi/10)%10;

        int yuzler =(sayi/100)%10;  //123

        int binler =(sayi/1000)%10; //12

        int onbinler =sayi/10000;   //1

        System.out.println(onbinler +"\n" + binler +"\n"+yuzler +"\n" + onlar +"\n"+ birler);



    }
}
