package practice02;

public class S08_Array_ETicaret {
    public static void main(String[] args) {
 /*
        Bir e-ticaret uygulamasında, bir kullanıcının sepetindeki ürünleri bir array'de tutuyorsunuz.
        Kullanıcının sepetinde belirli bir ürünün olup olmadığını kontrol edin.
        {"Telefon", "Bilgisayar", "Klavye", "Mouse"}
    */

        String urunler[] = {"Telefon", "Bilgisayar", "Klavye", "Mouse"};

        String arananUrun = "Klavye";
        boolean urunVar = false ;

        for (String urun : urunler) {
            if (urun.equals(arananUrun)) {
                System.out.println("Aranan ürün bulundu.");

                urunVar=true;

                break;

            }
        }
        if (urunVar){
            System.out.println("Sepetinizde " + arananUrun + " bulunmaktadır .");
        }else {
            System.out.println("Sepetinizde " + arananUrun + " BULUNMAMAKTADIR. .");
        }
    }
}
