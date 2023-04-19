package day08nestedif;

import java.util.Scanner;

public class C01_NestedIf {

    /*
    TASK: kULLANICIDAN 3 TANE POZITIF BIR TAM SAYI ALINIZ.
     Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz.
     Eger ucgen ise es kenar ucgen olma durumunu kontrol ediniz

     INFO:UCGEN OLMA SARTI:
     herhangi kenar toplami ucuncu kenardan buyuk olmali.
     herhangi iki kenar farki ucuncu kenardan kucuk olmali

    a+b>c>a-c
    a+c>b>a-c
    b+c>a>b-c

    a=b=c boyle ise eskenar ucgen

   Java Nested kodlari calistirirken cok zaaman harciyor buna TIME COMPLEXITY DENILIYOR O YUZDEN NESTED KOD YAZILMAMALI
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");

        // Kullanici yanlislikla negatif sayi girdi ise kod asagidaki gibi yazilabilir.
        double a = Math.abs(input.nextDouble());
        double b = Math.abs(input.nextDouble());
        double c = Math.abs(input.nextDouble());

        // Kullanicinin negatif sayi girmesini affetmiyorum derseniz:
        if(a<0 || b<0 || c<0){
            System.out.println("Ucgen kenarlari negatif olamaz");
        }
        if ((a + b > c && c > a - b ) && ( a + c > b && b > a - c  ) && (b + c > a && a > b - c) ) { // Ucgen olma Durumu buyuk if
          if(a==b && b==c && a==c){
              System.out.println("Eskenar ucgen");
          }else{
              System.out.println("Ucgen eskenar degil");

          }
        }else{
            System.out.println("Sen ucgen degilsin");
        }








        //EX2:  Kullanicidan bir ucgenin kenar uzunlugunu aliniz 3 kenari bir birine esit ise "Eskenar ucgen yazdiriniz"
        //Sadece iki kenar bir birine esit ise "Ikiz kenar ucgen"
        // Tum kenarlari farkli ise "Cesit kenar ucgen" yazdiriniz

        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) {
            if (x == y && y == z) {
                System.out.println("Eskenar Ucgen");
            } else if (x == y || y == z || x == z) {
                System.out.println("Ikizkenar Ucgen");
            } else {
                System.out.println("Cesitkenar Ucgen");
            }
        } else {
            System.out.println("Ucgen degildir");
        }


    }//main
}