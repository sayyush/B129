package day12loops;

public class C04_WhileLoop {

    public static void main(String[] args) {
        // Ex 1: 3'den 10'a kadar tamsayilari ayni satira yazdiran kodu yaziniz
        // 1. Yol
        for (int i = 3; i <11 ; i++) {
            System.out.print(i+" ");

        }

        // 2. Yol    WHILE LOOP daha sade
        System.out.println();

        int i = 3; // baslangic degeri
        while(i< 11){   // bitis degeri
            // System.out.print(i+" ");
            i++; // artirma while loop'un body'si icinde

        }

        // Ex 3 : 17den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz
            int k =17;
            while(k>3){ // bitis degeri

            if(k%2==0){ // ciftse

                //System.out.print(k+" ");
            }
            k--;
        }

    }
}
