package team116_practice;

import java.util.Scanner;

public class C03_Bolme {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Bolunen sayiyi giriniz: ");
        int bolunen = scan.nextInt();

        System.out.print("Bolen sayiyi giriniz: ");
        int bolen = scan.nextInt();

        int bolum = bolme(bolunen, bolen);

        System.out.println("Bolum: " + bolum);
    }

    public static int bolme(int bolunen, int bolen) {
        int bolum = 0;
        while (bolunen >= bolen) {
            bolunen -= bolen;
            bolum++;
        }
        return bolum;
    }
}
    //Bu örnekte, Scanner sınıfı kullanarak kullanıcıdan iki tamsayı girdisi alınır.
    // Sonrasında bolme() metoduna bu iki sayı parametre olarak geçirilir ve bölüm sonucu bolum değişkenine atanır.
    // En sonunda, bölüm sonucu ekrana yazdırılır.

    //Örnek olarak, kullanıcı 20 ve 4 sayılarını girerse, program 5 değerini hesaplar ve ekrana "Bolum: 5" yazdırır.








