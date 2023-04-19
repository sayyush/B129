package day07ifstatement;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        // if it rains, I will cancel the picnic
        // eger yagmur yagarsa piknige iptal edecegim


      // Ex1) Verilen character buyuk harf ise ekrana " Buyuk harf" yazdiran
        //    kucuk harf ise "Kucuk harf"  yazdiran kodu olusturunuz


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz...");
        char ch =input.next().charAt(0);

     //   char ch = 'S';  Scanner clasini olusturmadanda boyle yapabiliyoruz
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(("Buyuk harf"));

            if (ch >= 'a' && ch <= 'z') {
                System.out.println("Kucuk harf...");
            }


            // 2.Way :
            char ch1 = 'S';

            if(ch1>='A' && ch1<='Z'){
                System.out.println("Buyuk harf..");
            }else if(ch1>='a' && ch1<='z'){
                System.out.println("Kucuk harf...");
            }else{
                System.out.println("Harf degildir...");
            }




            // Ex2: Verilen bir sayi cift sayi ise ekrana cift sayi yazdiran kodu olusturunuz   // modulus islemi
            byte num1 = 24;

            if (num1 % 2 == 0) {
                System.out.println("Cift Sayi");
            }
            //Ex3: Verilen bir sayi 300den kucuk veya 1200'den buyuk ise ekrana "Harika Sayi" yazdiran kodu olusturunuz
            int number = 500;
            if (number < 300 || number > 1200) {
                System.out.println("Harika Sayi");
            }
            //  Ex 4) Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

            System.out.println("Lutfen bir sayi giriniz");
            int num = input.nextInt();
            // Burada iki kontrol yapildi
            if (num % 2 == 0) {

                System.out.println("Cift Sayi");
            }
            if (num % 2 != 0) {
                System.out.println("Tek Sayi");
            }

            // 2.Yol:
            if (num % 2 == 0) {
                System.out.println("Cift Sayi");
            } else {  //ELSE demek diger tum ihtimaller demek
                // burada conditional bir sart yok,
                // tek kontrol var Javaya az is yaptirmis oluyoruz. KODLARDA MAKBUL OLAN BUDUR
                System.out.println("Tek Sayi");

            }

            // Ex5: Verilen bir sayinin negatif pozitif yada notr oldugunu soyleyen kodu yaziniz
            // if else sadece dogru olani alir geri kalani islem yapmaz
            int numara = 105;
            if (numara > 0) {
                System.out.println("Pozitif Sayi");
            } else if (numara<0) {
                System.out.println("Negatif Sayi");
            } else {
                System.out.println("notr ");
            }


        }}}