package team116_practice;

import java.util.ArrayList;
import java.util.List;

public class C09_ornekSoruCozumu {
    public static void main(String[] args) {

        //- Verilen String bir array’deki her bir elementi kontrol edip,
        //- Kelimenin uzunlugu cift sayi ise ilk yarisini
        //- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //yeni bir listeye ekleyip yazdirin.

        String[] kelimeler={"elma", "kiraz","uzum", "seftali"};
        List<String> list=new ArrayList<String>();

        for (String kelime:kelimeler){
            if (kelime.length()%2==0) {
                list.add(kelime.substring(0, kelime.length() / 2));
            }else{
                list.add(kelime.substring(kelime.length()/2));
            }
        }
        System.out.println("Kelimenin ilk yarisi veya ikinci yarisi : " +list);




    }
}
