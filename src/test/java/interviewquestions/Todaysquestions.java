package interviewquestions;

import java.util.Scanner;

public class Todaysquestions {
    public static void main(String[] args) {


        // 18) Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
        //  Örneğin; Hello ==> Heo

        String s = "Hello";
        int i = 0;

        while (i < s.length()) {


            String c = s.substring(i, i + 1);



            if (s.indexOf(c) == s.lastIndexOf(c)) {

                System.out.print(c);
            }
            i++;
        }

        //  indexOf(): girelen ilk harfin ilk indexini verir
        // lastIndexOf(): girelen harfin sondan baslayarak bastan kacıncı indexte oldugu verir

        System.out.println();

        //17) Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.

        int num = 753;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);

        System.out.println();

        //Example 3: Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz

        int num1 = -578;

        num1 = Math.abs(num);
        int sum1 = 0;

        while (num1 > 0) {
            sum1 = sum1 + num % 10;
            num1 /= 10;
        }
        System.out.println(sum1);







       // 16) Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.
      //  1. Yol:
        String s1 = "Christmas";
        String result = "";
        for(int i1=0; i<s1.length(); i1++){
            String c = s1.substring(i1,i1+1);
            if(c.equals("m")){
                break;
            }
            result = result + c;
        }
        System.out.println(result);
      //  2. Yol:
        String s2 = "Christmas";
        String result1 = "";
        int i1=0;
        while( i1<s.length()){
            String c = s2.substring(i1,i1+1);
            if(c.equals("m")){
                break;
            }
            result = result + c;;
            i1++;
        }


          /*
    Interwiew Questions
     Kullanicidan toplanmak uzere sayilar isteyin
     sayi adedi 10'u gecerse veya toplam 500 'u gecerse
     bu kadar sayi yeter
     ".... adet sayi girdiniz , toplami..." yazdirin
     */
        //sayi adedi= sayac
        //toplam

        Scanner input = new Scanner(System.in);

        int sayi = 0;
        int toplam = 0;
        int sayac = 0;  //         2+0=0   2+1=3      *==> 1   2*1=2  ""  true


        while (sayac < 11 && toplam < 501) {
            System.out.println("Lutfen toplanmak uzere bir sayi giriniz..");
            sayi = input.nextInt();//her adimda gozuksun diye loop icinde yazdik
            toplam += sayi; //toplam=toplam+sayi;
            sayac++;

        }
        if (toplam > 500) {
            System.out.println(sayac + " adet sayi girdiniz . Toplami " + toplam);
        } else
            System.out.println("Bu kadar sayi yeter. " + sayac + " adet sayi girdiniz Toplam " + toplam);




    }
}
