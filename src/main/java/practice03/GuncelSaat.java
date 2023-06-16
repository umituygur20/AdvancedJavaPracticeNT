package practice03;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GuncelSaat {
    public static void main(String[] args) throws InterruptedException {
        while (true){
          DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("HH:mm:ss");
           LocalTime simdikiSaat =  LocalTime.now();
           Thread.sleep(400);
            System.out.print("\r" +dtf.format(simdikiSaat)); // "\r" ekranda görüneni silip yeni değeri yazıyor .

        }
    }
}
