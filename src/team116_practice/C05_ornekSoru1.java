package team116_practice;

import java.util.Scanner;

public class C05_ornekSoru1 {
    public static void main(String[] args) {

        // Ask the user for a String and a sentences
        //         * Find and print occurrence of String in sentences.
        //         * (without case sensitivity)
        //         *
        //         * sentences =“hihihi” String=“hi” output=“There are 3 "hi"s in hihihi "
        //         * sentences =“I am coming” String=“com” output ="there is 1 “com” in sentences "

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cumle giriniz: ");
        String cumle = scan.nextLine();

        System.out.print("Bir dize giriniz: ");
        String dize = scan.nextLine();

        int sayac = dizeSayac(cumle, dize);

        System.out.println("Cümle: " + cumle);
        System.out.println("Dize: " + dize);
        System.out.println("Cümledeki " + dize + " sayisi: " + sayac);
    }

    public static int dizeSayac(String cumle, String dize) {
        cumle = cumle.toLowerCase();
        dize = dize.toLowerCase();

        int sayac = 0;
        int index = cumle.indexOf(dize);

        while (index != -1) {
            sayac++;
            cumle = cumle.substring(index + 1);
            index = cumle.indexOf(dize);
        }

        return sayac;
    }
}

//Bu örnekte, Scanner sınıfı kullanarak kullanıcıdan bir cümle ve bir dize girisi alınır ve dizeSayac() metodu,
// büyük/küçük harf duyarlılığı olmaksızın cümle içinde kaç kez dizenin geçtiğini bulmak için kullanılır.
// dizeSayac() metodu, toLowerCase() metodunu kullanarak cümle ve dizeyi küçük harfe çevirir
// ve ardından indexOf() metodunu kullanarak dizenin ilk indeksini bulur.
// Dizenin bulunduğu her indeks için sayac arttırılır ve cümle, bulunan indeksin
// bir sonrasındaki karakterlerle güncellenir. Döngü, dizenin tüm bulunduğu indeksler bulunana kadar devam eder
// ve sonunda sayac değeri geri döndürülür.
//
//Örneğin, kullanıcı "Merhaba dünya!" cümlesini girer ve "a" dizesini ararsa,
// program "Cümle: Merhaba dünya!", "Dize: a" ve "Cümledeki a sayisi: 3" gibi bir çıktı üretir.
