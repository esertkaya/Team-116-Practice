package team116_practice;

public class C01_soruCozumu_ifIfElse {
    public static void main(String[] args) {

        //“if” yapısı, bir koşulun doğruluğunu kontrol eder
        //ve eğer koşul doğruysa, “if” bloğu içinde yer alan kodlar çalıştırılır.

        int sayi = 5;
        if (sayi > 0) {
            System.out.println("sayi pozitif bir sayıdır.");
        }

        //if-else” yapısı ise, bir koşulun doğruluğunu kontrol eder
        // ve eğer koşul doğruysa “if” bloğu içinde yer alan kodlar,
        // yanlışsa “else” bloğu içinde yer alan kodlar çalıştırılır.

        int sayi1 = 5;
        if (sayi1 > 0) {
            System.out.println("sayi pozitif bir sayıdır.");
        } else {
            System.out.println("sayi negatif veya sıfırdır.");
        }

       // “if-else” yapısının bir üst seviyesi olarak, “if-else if-else” yapısı da kullanılabilir.
        // Bu yapıda, birden fazla koşul kontrol edilebilir
       // ve eğer bir koşul doğruysa, o koşulun bloğu çalıştırılır
        // ve diğer koşullar kontrol edilmez.

        int not = 85;
        if (not >= 90) {
            System.out.println("AA");
        } else if (not >= 85) {
            System.out.println("BA");
        } else if (not >= 75) {
            System.out.println("BB");
        } else {
            System.out.println("FF");
        }


    }
}


