public class Main {
    private String marotonAdı;

    public String[] katılanlar;

    public final int[] zamanlar;


    public Main(String marotonAdı, String[] katılanlar, int[] zamanlar) {
        this.marotonAdı = marotonAdı;
        this.zamanlar = zamanlar;
        this.katılanlar = katılanlar;

    }

    public void setMarotonAdı(String marotonAdı) {
        this.marotonAdı = marotonAdı;
    }

    public String getMarotonAdı() {
        return marotonAdı;
    }

    public void displayMessage() {
        System.out.println("Maroton adı: " + getMarotonAdı());
    }

    public void processMaroton() {
        System.out.println("Sıralama:");
        for (int i = 0; i < katılanlar.length; i++) {
            if (zamanlar[i] == getBirinci()) {
                System.out.println("BİRİNCİ: "+katılanlar[i]+" "+getBirinci()+"'");
            }
        }for (int i = 0; i < katılanlar.length; i++) {
            if (zamanlar[i] ==getİkinci()){
                System.out.println("İKİNCİ: "+katılanlar[i]+" "+getİkinci()+"'");
            }
        }
        for (int i = 0; i < katılanlar.length; i++) {
            if (zamanlar[i]==getÜcüncü()){
                System.out.println("ÜÇÜNCÜ: "+katılanlar[i]+" "+getÜcüncü()+"'");}
        }
        Zaman();
    }

    public int getBirinci() {
        int birinci = zamanlar[1];
        for (int zaman : zamanlar) {
            if (zaman < birinci) {
                birinci = zaman;
            }
        }


        return birinci;
    }

    public int getİkinci() {
        int sayac = -1;
        int ikinci = zamanlar[1];
        for (int zaman : zamanlar) {
            if (zaman < ikinci && zaman != getBirinci()) {
                sayac++;
                ikinci = zaman;
            }

        }

        return ikinci;

    }

    public int getÜcüncü() {
        int ücüncü = zamanlar[1];
        for (int zaman : zamanlar) {
            if (zaman < ücüncü && zaman != getBirinci() && zaman != getİkinci()) {
                ücüncü = zaman;
            }
        }
        return ücüncü;
    }

    public void Zaman() {
        int i = 0;
        int j = 0;
        int z = 0;
        for (int zaman : zamanlar) {
            if (zaman > 200 && zaman < 300)
                i++;
            else if (zaman > 300 && zaman < 400)
                j++;
            else if (zaman > 400)
                z++;
        }
        System.out.println("A ->" + i + "\nB ->" + j + "\nC ->" + z);
    }

}