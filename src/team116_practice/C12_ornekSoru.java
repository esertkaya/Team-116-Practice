package team116_practice;

public class C12_ornekSoru {

    //Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
    //olusturun

    public static void main(String[] args) {
        String[] kelimeler = {"Merhaba", "Dunya", "Java", "Guzeldir"};
        enUzunKelimeBul(kelimeler);
        enKisaKelimeBul(kelimeler);


    }

    public static void enUzunKelimeBul(String[] kelimeler) {
        String enUzunKelimeBul = kelimeler[0];
        for (int i = 1; i < kelimeler.length; i++) {
            if (kelimeler[i].length() > enUzunKelimeBul.length()) {
                enUzunKelimeBul = kelimeler[i];
            }
        }
        System.out.println(enUzunKelimeBul);
    }

    public static void enKisaKelimeBul(String[] kelimeler) {
        String enKisaKelimeBul = kelimeler[0];
        for (int i = 1; i < kelimeler.length; i++) {
            if (kelimeler[i].length() < enKisaKelimeBul.length()) {
                enKisaKelimeBul = kelimeler[i];


            }

        }
        System.out.println(enKisaKelimeBul);
    }
}