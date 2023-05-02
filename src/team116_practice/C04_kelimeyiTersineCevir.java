package team116_practice;

import java.util.Scanner;

public class C04_kelimeyiTersineCevir {
    public static void main(String[] args) {

        //SORU:kullanıcıdan bir cümle veya kelime girmesini isteyip
        //girilen değeri tersine  yazdıran bir method oluşturun
        Scanner scan=new Scanner(System.in);

        System.out.print("Bir kelime veya cumle giriniz: ");
        String giris = scan.nextLine();

        String ters = tersCevir(giris);

        System.out.println("Giris: " + giris);
        System.out.println("Ters cevrilmis hali: " + ters);
    }

    public static String tersCevir(String metin) {
        String tersMetin = "";
        for (int i = metin.length() - 1; i >= 0; i--) {
            tersMetin += metin.charAt(i);
        }
        return tersMetin;
    }
}
    //Bu örnekte, Scanner sınıfı kullanarak kullanıcıdan bir metin girdisi alınır
    // ve tersCevir() metoduna parametre olarak geçirilir.
    // tersCevir() metodu, girilen metni tersine çevirmek için bir döngü kullanır
    // ve ters metni oluşturarak return anahtar kelimesi ile geri döndürür.

    //Örnek olarak, kullanıcı "Merhaba dünya!" ifadesini girerse,
// program "Giris: Merhaba dünya!" ve "Ters cevrilmis hali: !aynüd abahreM" gibi bir çıktı üretir.








