package practice_daytime;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {

        //Dikdortgenin alanini hesaplayan metodu olustururnuz ve kullaniniz.

            //protokol alani

            dikdortgenAlani(5,10);


        } //main in body

    /*

         Access          static      Data         MethodAdi   (parametreler)
         Modifier                    type


     */


        public static int dikdortgenAlani (int a,int b){

            //main method static oldugu icin main icindeki her seyin static olmasi gerekir
            //method adi camelCase kucuk harfle baslar sonraki her kelimenin ilkk harfi buyukj olur.

            return a*b; //carpmanin sonucunu kullaniciya ver

        }

    public static class C04_WhileLoop {
        public static void main(String[] args) {

            /*
           Interwiew Questions
           Kullanicidan toplanmak uzere sayilar isteyin
           sayi adedi 10'u gecerse veya toplam 500 'u gecerse
          bu kadar sayi yeter
          ".... adet sayi girdiniz , toplami..." yazdirin
          */

            // sayi adedi= sayac
            // toplam icin bir comtainer


            Scanner input = new Scanner(System.in);
            int sayi = 0;
            int toplam = 0;
            int sayac = 0;      // default olarak carpma isleminde 1 vericez.  Stringlerde 0 veriyoruz  booleanda'da default degeri olarak true yaziyoruz
            //  2+0=0  2+1=3 *==>1 2*1=2   "" true

            while (sayac < 11 && toplam < 501) {
                System.out.println("Lutfen toplanmak uzere bir sayi giriniz");
                sayi = input.nextInt(); // her adimda gozuksun diye loop icinde yazdik
                toplam += sayi;
                sayac++;
            }
            if (toplam > 500) {

                System.out.println(sayac + "adet sayi girdiniz. Toplami " + toplam);

            } else
                System.out.println("Bu kadar ");

        }
    }
}

