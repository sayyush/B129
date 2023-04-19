package ssg_konular;

import java.util.Scanner;

public class C01StringManipulations {

    public static void main(String[] args) {
           /*
        1.valueOf(): String'i interger'a cevirir
        2.indexOf(): girelen ilk harfin ilk indexini verir
        3.lastIndexOf(): girelen harfin sondan baslayarak bastan kacıncı indexte oldugu verir
        4.replace()-replaceAll(): kelimeleri degistirir
        5.chartAt(): Strindeki bir harfin indexi verir index yazarsak indexteki harfi verir
        6.equals()-equalsIgnoreCase(): equals esit mi diye kontrol eder ama sayısal ve char degerleri kontrol etmek icin == kullanılır
        7.toLowerCase()-toUpperCase(): buyuk ve kucuk harfe cevirmek icin kullanılır
        8.split(): bir Stringi verilen indexten 2ye boler
        9.isEmpty(): boş mu diye kontrol eder
        10. trim(): stringdeki bastaki ve sondaki boslugu siler
        11. isBlank(): bosluk var mı diye kontrol eder
        12.length()-10: karakter sayar
        13.subString(): ilk index yazılarak 2. indexe kadar 2. index dahil degil.
        14.endsWith(): sondaki harf ve karakteri icerip icermedigini kontrol eder.
        15.startsWith(): bastaki harf ve karakteri icerip icermedigini kontrol eder.
        16.concat(): Stringleri birlestirir
        17.contains(): icerip icermedigini kontrol eder
        */

        /*
          Sorular : Soru 1) Kullanicidan email adresini girmesini isteyin,
          mail@gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
          @gmail.com ile bitiyorsa "Email adresiniz kaydedildi "
          @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
          */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir email adresi giriniz");
        String email=scan.nextLine();
        if (!email.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz");

        } else if (email.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");

        }else
            System.out.println("lutfen yazimi kontole edin");


    }
    }

