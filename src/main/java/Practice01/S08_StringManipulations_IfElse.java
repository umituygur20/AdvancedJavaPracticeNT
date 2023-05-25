package Practice01;

import java.util.Scanner;

public class S08_StringManipulations_IfElse {
    public static void main(String[] args) {
  /*
        Kullanıcının girdiği bir String ifadenin son üç karakterini alarak bu üç karakteri String ifadenin başına ve sonuna ekleyen
        bir Java programı yazınız.
    */


        Scanner scan = new Scanner(System.in);

        System.out.println("EN AZ ÜÇ KARAKTERLİ BİR KELİME GİRİNİZ");

        String kelime = scan.next();

        if (kelime.length()>2){
           String sonUcHarf =  kelime.substring(kelime.length()-3);
            System.out.println(sonUcHarf+kelime+sonUcHarf);

        }else {
            System.out.println("EN AZ ÜÇ KARAKTERLİ BİR KELİME girmelisiniz!!!");
        }
    }
}
