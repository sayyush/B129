package day10switchloops;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {


        //     Switch statement "IF ELSE IF'IN YAPTIGI HERSEYI YAPAR".
        //     Switch daha sade, ifler karisik. 2 durum varsa if else'ler,
        //     2den fazla durum varsa o zaman SWITCH kullan.


        //Ex1 : Ay numarasini soyleyince , numarasi verilen aydan baslayip 12. aya kadar
        //      tum aylarin isimlerini yazdiran kodu yaziniz
        //      8==> September- october - november-

        Scanner input = new Scanner(System.in);
        System.out.println("Baslangic ayinin kacinci ay oldugunu giriniz...");
        int dayName = input.nextInt();

        switch (dayName) {
            case 1:
                System.out.println("january");
            case 2:
                System.out.println("February");

            case 3:
                System.out.println("March");

            case 4:
                System.out.println("April");

            case 5:
                System.out.println("May");

            case 6:
                System.out.println("June");

            case 7:
                System.out.println("July");

            case 8:
                System.out.println("August");

            case 9:
                System.out.println("September");

            case 10:
                System.out.println("October");

            case 11:
                System.out.println("November");

            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Gecerli ay numarasi veriniz");


        }}}


      /*
         Note : Switch'de  STRING    INT    BYTE   SHORT   CHAR

                    ************    INTERVIEW

        Note : Long Float Double boolean   BUNLAR KULLANILMAZ SWITCH'DE

       */


