package teamwork;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        //Example 1: 3'den 6'ya kadar tamsayilari console'a yazdiriniz

        //1.Yol: for-loop
        for (int i = 3; i < 7; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        //2.Yol: while-loop
        int i = 3;

        while (i < 7) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        //Example 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz
        int k = 23;

        while (k > 11) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
            k--;
        }

        System.out.println();

        //Example 3: Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz
        //1.YOL:
        int num = -578;

        num = Math.abs(num);
        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num /= 10;
        }
        System.out.println(sum);

        // 2. YOL :    //  soz dizimi olarak while daha anlasilir
        int a=684;
        int toplam =0;

        for(int m= a;m>0; m/=10){
            toplam= toplam + m%10;

        }
        System.out.println(toplam); // 19
        // NOTE: FOR ile WHILE farki: sadece soz dizimi farkli
    // INTERVIEW SORU


// Ex 1: 3'den 10'a kadar tamsayilari ayni satira yazdiran kodu yaziniz
// 1. Yol
        for (int ii = 3; ii <11 ; i++) {
        System.out.print(ii+" ");

        }

        // 2. Yol    WHILE LOOP daha sade
        System.out.println();

        int i1 = 3; // baslangic degeri
        while(i1< 11){   // bitis degeri
        // System.out.print(i+" ");
        i1++; // artirma while loop'un body'si icinde

        }

        // Ex 3 : 17den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz
        int kk =17;
        while(kk>3){ // bitis degeri

        if(kk%2==0){ // ciftse

        //System.out.print(kk+" ");
        }
        kk--;
        }

       // 9) String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
      //  Örneğin; 'Ali Can?' ==> l*i*a*n*
          //      1. Yol:
        String s = "Ali Can?";
        s = s.replaceAll("[^a-z]", "");
        String t = "";
        for(Integer i2=0; i<s.length(); i2++){
            String r = s.substring(i2,i2+1);
            t = t + r + '*';
        }
        System.out.println(t);
       // 2. Yol:
        String s1 = "Ali Can?";
        s1 = s1.replaceAll("[^a-z]", "");
        String t1 = "";
        Integer i3=0;
        while(i3<s1.length()){
            String r = s.substring(i,i+1);
            t = t + r + '*';
            i++;
        }
    // burda i t k lerde tekrar olmamasi icin dikkat et




        //Kullanıcıdan alınan bir sayının ilk ve son rakamlarını toplayan bir kod yazınız.

            Scanner input = new Scanner(System.in);
            System.out.println("Bir tamsayi giriniz.");
            int sayi = input.nextInt();

            //1. Yol:
            int sonRakam = sayi%10;
            System.out.println("sonRakam = " + sonRakam);
            int ilkRakam = sayi;

            while (ilkRakam>9){

                ilkRakam /= 10;

            }
            System.out.println("ilkRakam = " + ilkRakam);
            System.out.println("Toplam: "+(ilkRakam+sonRakam));

            //2. Yol:
            String sayiString = String.valueOf(sayi);
            int strIlkRakam = Integer.parseInt(sayiString.substring(0,1));
            int strSonRakam = Integer.parseInt(sayiString.substring(sayiString.length()-1));
            System.out.println("Toplam: "+(strSonRakam+strIlkRakam));

        }}






