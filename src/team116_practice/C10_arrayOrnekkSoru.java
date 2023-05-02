package team116_practice;

import java.util.ArrayList;

public class C10_arrayOrnekkSoru {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        ArrayList<Integer> ortakEleman = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    ortakEleman.add(array1[i]);
                }
            }
        }

        System.out.println("Common elements: " + ortakEleman);
    }
}

/*
İki adet integer array'e elemanları atayıp
Ortak elemanlar için yeni bir ArrayList oluştur.
İlk array'i for loopta  her bir eleman için ikinci array'de olup olmadığına bak
Eğer ortak bir eleman varsa, ArrayList'e ekle.Yazdir
 */

