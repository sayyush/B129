package day07ifstatement;

import java.util.Scanner;

public class C03_IfStatement {

    public static void main(String[] args) {

      /*
      Iki tane String datanin bir birine esit olup olmadigini anlamak icin "==" degil ; equals() kullaniriz
      i) equals() == > Buyuk kucuk harf onemser, farkliysa farkli data der
      ii) equalsIgnoreCase() ==> buyuk kucuk harf onemsemez

       */

        //Ex: Kullanicidan gun isimlerini aliniz hafta icimi hafta sonumu oldugu yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi = input.next();

        if (gunIsmi.equalsIgnoreCase("Cumartesi") || gunIsmi.equalsIgnoreCase("Pazar")) {
            System.out.println("Haftasonu");

        } else if (gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici");

        } else {
            System.out.println("Gecerli bir gun ismi giriniz");

            // 2. YOL
            boolean haftaici = gunIsmi.equalsIgnoreCase("Pazartesi") ||
                    gunIsmi.equalsIgnoreCase("Sali") ||
                    gunIsmi.equalsIgnoreCase("Carsamba") ||
                    gunIsmi.equalsIgnoreCase("Persembe") ||
                    gunIsmi.equalsIgnoreCase("Cuma");

            boolean haftasonu = gunIsmi.equalsIgnoreCase("Cumartesi") || gunIsmi.equalsIgnoreCase("Pazar");
            if (haftaici) {
                System.out.println("Hafta ici");
            } else if (haftasonu) {
                System.out.println("Haftasonu");
            } else {
                System.out.println("Gecerli bir gun ismi giriniz");

            }//else body
        }
    }
}