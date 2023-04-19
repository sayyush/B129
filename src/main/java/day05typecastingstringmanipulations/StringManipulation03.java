package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulation03 {
    public static void main(String[] args) {

      /*

   Example 1: Aşağıdaki kurallara göre kullanıcının girdiği password ü kontrol ediniz
   1) En az 8 karakter olsun
   2) Space karakteri password de olmasın
   3) En az bir tane büyük harf olsun
   4) En az bir tane küçük harf olsun
   5) En az bir tane sembol olsun
   6) en az bir tane rakam olsun

       */
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen passwordunuz giriniz");
       String pwd= input.nextLine();

       // En az 8 karakter olsun
         boolean first= pwd.length()>7;   //

       //  Space karakteri password de olmasın
        boolean second= !pwd.contains(" ");

       //  En az bir tane büyük harf olsun
        // NOTE: buyuk harf olmayanlari sil , sonra kalan karakter sayisina bak,
        // karakter sayisi 0 ise BUUK harf YOK demektir.
        // sifirdan buyuk ise buyuk harf var demektir.

        boolean third= pwd.replaceAll("[^A-Z]", "").length()>0; // methodlari ayni satirda yan yana kullanmaya "method chain (zincir)" denir


        // En az bir tane küçük harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]", "").length()>0;

        // En az bir tane sembol ( harf ve rakam harici her sey) olsun
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]", "").length()>0;

       // en az bir tane rakam olsun
        boolean sixth=pwd.replaceAll("[^0-9]", "").length()>0;

        System.out.println("Password gecerli mi?"+ (first && second && third && fourth && fifth && sixth));






    }

}
