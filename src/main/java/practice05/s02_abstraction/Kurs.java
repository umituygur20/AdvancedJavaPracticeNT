package practice05.s02_abstraction;

public abstract class  Kurs {
    String dersAdi;
    String ogretmenAdi;
    int dersSaati;
    double kursUcreti;


    public abstract String kategoriAdi();

    /** abstract yapmak için abstract yazarız .
     *   ama Class'a da abstract yapmamız lazım
     *   override edip abstract yaptık.
     *   Çünkü buradaki body'yi hiç kullanmayacaktık.
     *
     *   Class'ı abstract yapmak ayni zamanda Class'ı kısırlaştırmak demektir.
     *   Kısırlaştırdığınız zaman bu Class'tan Object üretemeyiz ..extend olma olayı
     *   kast edilmiyor obje olayı kast ediliyor.
     *   Artık obje uretilemez
     *
     *   Childler için abstract metodlar da zorunlu oldu
     *   Method'u abstract yap gerisini inteliJ'e bırak.
     *
     *
     *
     */

}
