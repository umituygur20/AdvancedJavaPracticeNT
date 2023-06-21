package advancedhomework;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class MusicPlayer {
    /*
        Bir müzik çalma listesi uygulaması geliştiriyorsunuz.
        Kullanıcılar, çalma listelerine şarkı ekleyebilmeli,
        şarkıları sıralayabilmeli ve
        şarkıları listeden silebilmelidir.
        Ayrıca, kullanıcılara çalma listesini tamamen sıfırlama seçeneği de sunmanız isteniyor.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<String> musiclistesi = new ArrayList<>();
        System.out.println("Welcome to Music Player List.");

        System.out.println(
                "Listene sarki eklemek istersen  ------> 1" +
                        "\n  Sarkilarini siralama istersen    ---> 2" +
                        "\n  Listenden sarki silmek istersen  ---> 3" +
                        "\n  Listeni sifirlamak istersen      ---> 4" +
                        "\n  Listeni görmek istersen          ---> 5" +
                        "\n  Cikmak istersen                  ---> 6"
        );


        do {
            int secim = input.nextInt();
            input.nextLine();
            switch (secim) {
                case 1:
                    System.out.println("Ekleyeceğin sarki ismini gir lütfen");
                    String sarki = input.nextLine();
                    listeyeEkle(musiclistesi, sarki);
                    break;
                case 2 :
                    sarkiSiralama();

            }
        }while (true);


    }

    private static void sarkiSiralama() {
        LinkedHashSet<String > lhs = new LinkedHashSet<>();

    }


    public static void listeyeEkle(List<String> liste, String eklenecek) {// int a int b şeklinde düşünebilirsiniz.

        if (!liste.contains(eklenecek)) {

            liste.add(eklenecek);

            System.out.println(eklenecek + " listeye başarılır bir şekilde eklendi.");
        } else {
            System.out.println(eklenecek + " listede zaten var .Tekrar eklenemez");
        }

    }
    public static void listedenSil(List<String> liste ,String silinecek){

        liste.remove(silinecek);

    }

}
