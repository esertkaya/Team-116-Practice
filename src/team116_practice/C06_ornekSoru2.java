package team116_practice;

import java.util.Scanner;

public class C06_ornekSoru2 {
    public static void main(String[] args) {

        //Ask user Name, Surname and credit card numbers than convert it to special
        //         * form
        //         *
        //         * (Check credit card number, if there aren’t 16 digit print
        //         * “Invalid credit card number”
        //         *
        //         * Input : John White 1234234534561478
        //         * Output : Name : J*** W****
        //         *          CCN  : **** **** **** 1478
        //         *  (Initials for name and surname should be uppercase)

        Scanner scan = new Scanner(System.in);

        System.out.print("Adınızı giriniz: ");
        String ad = scan.next();

        System.out.print("Soyadınızı giriniz: ");
        String soyad = scan.next();

        System.out.print("Kredi kartı numaranızı giriniz: ");
        String kartNo = scan.next();

        if (kartNo.length() != 16) {
            System.out.println("Geçersiz kredi kartı numarası");
            return;
        }

        String adInic = ad.substring(0, 1).toUpperCase() + "***";
        String soyadInic = soyad.substring(0, 1).toUpperCase() + "***";
        String son4 = kartNo.substring(12);

        System.out.println("Ad: " + adInic + " " + soyadInic);
        System.out.println("Kredi Kartı Numarası: **** **** **** " + son4);
    }
}
    // Bu örnekte, Scanner sınıfı kullanarak kullanıcıdan ad, soyad ve kredi kartı numarası alınır.
    // Ardından, length() metodu kullanılarak kart numarasının 16 haneli olup olmadığı kontrol edilir.
    // Eğer değilse, "Geçersiz kredi kartı numarası" yazdırılır ve program sonlandırılır.
    //Kart numarası 16 haneli ise, substring() ve toUpperCase() metodları kullanılarak adın ilk harfi,
    //üç yıldız ve soyadın ilk harfi, üç yıldız şeklinde özetlenir.
    // Son 4 rakam ise substring() metodu kullanılarak ayrılır. S
    // on olarak, bu bilgiler özel bir formatta println() metodunu kullanarak ekrana yazdırılır.

    //Örneğin, kullanıcı "John" adını, "White" soyadını ve "1234234534561478" kredi kartı numarasını girerse,
   // program "Ad: J*** W***" ve "Kredi Kartı Numarası: **** **** **** 1478" şeklinde bir çıktı üretir.










