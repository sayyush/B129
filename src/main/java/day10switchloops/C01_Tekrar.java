package day10switchloops;

import java.util.Scanner;

public class C01_Tekrar {
    public static void main(String[] args) {
/*
      If else de kontrolu gereken sart cok ise kullanılır.
     long, double, float, boolean kullaniamaz

      Soru: Kullanicidan bir sayi girmasini isteyin.
         10 ise "iki basamakli en kucuk sayi"
         100 ise "uc basamakli en kucuk sayi"
         1000 ise "dort basamakli en kucuk sayi"
         diger durumlarda "girdigin sayiyi degistir" yazdirin. */

        int a = 10;
      switch(a){
          case 10:
              System.out.println("iki basamakli en kucuk sayi");
              break;
          case 100:
              System.out.println("uc basamakli en kucuk sayi");
              break;
          case 1000:
              System.out.println("dort basamakli en kucuk sayi");
            break;
          default:
              System.out.println("girdigin sayiyi degistir");

      }

      /*Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin.
      kullanici S girerse "Software"
             D girerse "Developer"
             E girerse "Engineer"
             T girerse "In testing" yazdirin.
      */

      char h = 'd';
      switch(h){
          case 'S':
              System.out.println("Software");
              break;
          case 'D':
              System.out.println("Developer");
              break;
          case 'E':
              System.out.println("Engineer");
              break;
          case 'T':
              System.out.println("In testing");
          break;

      }

      // Kullanicidan gun ismi alip haftaici veya haftasonu yazdiralim.

        Scanner input= new Scanner(System.in);
        System.out.println("Gun ismi giriniz");
        String gunIsmi= input.next().toLowerCase();

        switch(gunIsmi){
            case "pazartesi":
                System.out.println("Haftaici");
                break;
            case "sali":
                System.out.println("Haftaici");
                break;
            case "carsamba":
                System.out.println("Haftaici");
                break;
            case "persembe":
                System.out.println("Haftaici");
                break;
            case "cuma":
                System.out.println("Haftaici");
                break;
            case "cumartesi":
                System.out.println("Haftasonu");
                break;
            case "pazar":
                System.out.println("Haftasonu");
                break;

        }












    }
}

