package day03scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //Ex : Kullanicidan alacaginiz 5 basamakli
        // sayinin ilk iki ve son iki basamagindaki
        // rakamlari toplamini yazdiran kodu yaziniz.
        // 12345:1000=12.345  tam sayi oldugu icin .dan onceki sayiyi alir

        // 12345===>1+2+4+5=12
        // output==> = 12

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz ");

        int num = input.nextInt();
        //12345

        int ilkIkiRkm = num / 1000;

        System.out.println("ilkIkiRakam===>" + ilkIkiRkm);// 12

        int ilkIkiTop = (ilkIkiRkm % 10) + (ilkIkiRkm / 10);//MODULUS %10 > 12/10= kalan sayi 2'yi aliyoruz
        System.out.println("ilkIkiTop=" + ilkIkiTop); //3


        int sonIkiRkm = num % 100;// 12345:100=123.45 kalan sayiyi alicaz 45 yani MODULUS
        System.out.println("sonIkiRkm = " + sonIkiRkm); //45

        int sonIkiRkmTop = (sonIkiRkm % 10) + (sonIkiRkm / 10);
        System.out.println("sonIkiRkmTop = " + sonIkiRkmTop); //9

        int toplam = ilkIkiTop + sonIkiRkmTop;
        System.out.println("toplam = " + toplam); //12

    }
}
