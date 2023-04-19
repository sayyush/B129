package day03scanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        // Ex 1) Kullanicidan sayilari alarak toplama islemi yaptiran kodu yaziniz.

        Scanner input = new Scanner(System.in);// system.in==> sisteme dahil etmek demek

        System.out.println("Lutfen toplanacak olan ilk sayiyi giriniz"); //3.4
        double sayi1 = input.nextDouble();

        System.out.println(" Lutfen toplanacak olan ikinci sayiyi giriniz"); // 5.6
        double sayi2 = input.nextDouble();

        System.out.println(" Toplam="+ (sayi1 + sayi2));// 9.0


    }


}
