package team116_practice;

public class C11_ornekSoru {
    public static void elemanKontrol(int[] eleman, int arananEleman) {
        int sayac = 0;
        boolean elemanVarMi = false;
        for (int i = 0; i < eleman.length; i++) {
            if (eleman[i] == arananEleman) {
                sayac++;
                elemanVarMi = true;
            }
        }
        if (elemanVarMi) {
            System.out.println(arananEleman + " elemanı " + sayac + "var");
        } else {
            System.out.println(arananEleman + "yok");
        }

    }

    public static void main(String[] args) {
        System.out.println();
    }
}