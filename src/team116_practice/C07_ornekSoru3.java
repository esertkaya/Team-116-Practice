package team116_practice;

import java.util.Scanner;

public class C07_ornekSoru3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.print("Bir kelime giriniz: ");
        String kelime = scan.next();

        int uzunluk = kelime.length();
        int ortaIndis = uzunluk / 2;

        if (uzunluk % 2 == 0) {
            // Kelime çift uzunlukta ise
            System.out.println(kelime.charAt(ortaIndis - 1) + "" + kelime.charAt(ortaIndis));
        } else {
            // Kelime tek uzunlukta ise
            System.out.println(kelime.charAt(ortaIndis));
        }

    }
}