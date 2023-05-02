package team116_practice;

import java.util.Scanner;

public class C02_soruCozumu_ifElseIf {
    public static void main(String[] args) {

        //SORU1- Kullanicidan ik tane not girmesini isteyin.
        // Bu iki notun ortalamasini alip
        // Gectiniz veya Kaldiniz yazdirin

        /*Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen birinci notunuzu giriniz");
        int not1= scan.nextInt();
        System.out.println("Lutfen ikinci notunuzu giriniz");
        int not2= scan.nextInt();


        if ((not1+not2) /2>=50){
            System.out.println("Tebrikler gectiniz");
        }else{
            System.out.println("Kaldiniz");
        }



        System.out.println("***********************");


         */
        // SORU2- Kullanicidan notunu girmesini isteyin.
        //        Girilen notun harf degerini yazdirin


      /*  Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();

        if (not<0 || not>100){
            System.out.println("Gecersiz not");
        }else if (not>=85){
            System.out.println("AA");
        }else if (not>=70){
            System.out.println("BB");
        }else if (not>=55){
            System.out.println("CC");
        }else if (not>=40){
            System.out.println("DD");
        }else{
            System.out.println("FF");
        }


       */




        //SORU3- Kullanicidan bir karakter girmesini isteyin
        //       Girilen karakterin harf mi,sayi mi,ozel karakter mi oldugunu yazdirin

        /*Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);

        if (karakter>='a' && karakter<='z' || karakter>='A' && karakter<='Z') {
            System.out.println("Harf girdiniz");
        }else if (karakter>='0' && karakter<='9') {
            System.out.println("sayi girdiniz");
        }else{
            System.out.println("ozel karakter girdiniz");
        }

         */

        //SORU4- Kullanicidan haftanin gunlerini sayi olarak girmesini isteyin
        //       Girilen sayinin hangi gun oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Haftanin gunlerini sayi olarak girin");
        int gun= scan.nextInt();

        if (gun>=8 || gun<1) System.out.println("Gecersiz giris yaptiniz");
        if (gun==1) System.out.println("Pazartesi");

        if (gun==2)System.out.println("Sali");

        if (gun==3) System.out.println("Carsamba");
        if (gun==4) System.out.println("Persembe");
        if (gun==5) System.out.println("Cuma");

        if (gun==6) System.out.println("Cumartesi");

        if (gun==7) System.out.println("Pazar");


            //SORU5- Kullanicidan notunu girmesini isteyin
            //      Girilen not 50'den yuksekse Tebrikler Gectin
            //      50'den dusukse Maalesef Kaldin yazdirin
            //NOT: Ternary kullanarak cozun

        /*Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int not= scan.nextInt();

        System.out.println(not>=50 ? "Tebrikler Gectiniz" : "Maalesef Kaldiniz");


         */
            //Scanner scan=new Scanner(System.in);
            //System.out.println("Lutfen notunuzu giriniz");
            //int not=scan.nextInt();

            //System.out.println(not<50 ? "Maalesef kaldin" : "Tebrikler Gectin");


        }
    }
