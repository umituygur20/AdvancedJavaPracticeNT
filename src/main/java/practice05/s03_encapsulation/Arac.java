package practice05.s03_encapsulation;

public class Arac {

   private String marka;
   private String model;
   private String yakit;
   private double gunlukKira;

    public Arac(String marka, String model, String yakit, double gunlukKira) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.gunlukKira = gunlukKira;
    }

    // sağ tıkla generate de -- setter ve getter'i seçin hangilerini set ve get etmek istiyorsan seçiyorsun.
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }

    public void setYakit(String yakit) {
        this.yakit = yakit;
    }

    public double getGunlukKira() {
        return gunlukKira;
    }

    public void setGunlukKira(double gunlukKira) {
        this.gunlukKira = gunlukKira;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakit='" + yakit + '\'' +
                ", gunlukKira=" + gunlukKira +
                '}';
    }
}
