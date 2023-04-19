package day03scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // Kullanicidan bir dikdortgenin en ve boyunu alan ve  dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
        // dikdortgenin alani= en*boy;
        // dikdortgenin cevresi = 2*(en + boy)

     Scanner input= new Scanner(System.in);
     System.out.println("Lutfen dikdortgenin kisa kenarini aliniz");//2
        int en= input.nextInt();


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin uzun kenarini aliniz");//10
        int boy= input.nextInt();


        System.out.println("Alan==>"+(en*boy));//20
        System.out.println("cevre"+(2*(en+boy)));//24

    }

}
