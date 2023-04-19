package day06stringmanipulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {

        // Ex1: Bir String'in bas ve sonunda space character'i varsa siliniz
        //         "  Ali Can   "  bu sekilde space space Ali Can  space space   diyerek hata yapti  ==>   bizede boyle lazim   "Ali Can"

        String s = "   Ali Can  ";
        System.out.println(s);

        // trim( ucundan azicik kesmek)  methodu bir string'in bas ve sonundaki space karakterini siler aradaki space'lere dokunmaz.

        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        // Ex2: Asagida fiyatlari verilen urunlerin toplam fiyatlarini bulunuz
        //     String tv = "$456.99";     String laptop = "$456.99";  ==> 456.99 + 875.99 = 1332.98

        String tv = "$456.99";
        String laptop = "$456.99";

        // ??????


        // Ex3: Verilen ismin ilk isminin ilk harfini soy isminin ilk harfini yazdiriniz
        //      "Ali Can " ==> Ac

        String name = "   ali cAN   ";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second); // C

        System.out.println("" + first + second);

        //Ex4: Bir string'in hic karakter icermedigini (bos string) kontrol eden kodu yaziniz
        String str = "";

        // 1.Yol: Length() kullan
        boolean result1 = str.length() == 0;
        System.out.println("string bos mu?" + result1); // true

        //2.yol:isEmpty() kullan, Java bir konuda method uretmisse, o method'u kullanmak en iyisidir
        boolean result2 = str.isEmpty();
        System.out.println(result2);
// Ex5: Bir String'in space haric hicbir karakter icermedigini kontrol eden kodu yaziniz

        String t = "     ";
        //  1. yol:
        boolean result3 = t.replace(" ", "").length() == 0;
        System.out.println(result3);

        // 2.yol:

        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println("Sadece space mi var? " + result4);

        // 3.yol:
        // isBlank() methodu sadece space iceren stringler icin true verir, space disinda bir karakter icerirse false verir

        boolean result5 = t.isBlank();
        System.out.println(result5);

// Ex6: Bir string'de a, e, i karakterlerinin ilk gorumlerinin indexleri toplamini ekrana yazdiriniz
        //        "Java is easy to learn" ==> 1+5+8=14
        String r = "Java is easy to learn";

        int idxA = r.indexOf('a');// 1
        System.out.println(idxA);

        int idxI = r.indexOf('i');
        System.out.println(idxI); // 5

        int idxE = r.indexOf('e');
        System.out.println(idxE); // 8

        System.out.println("Index'ler toplami:" + (idxA + idxI + idxE)); //14

        // Ex7: Bir string'de " Java " kelimesinin kacinci index'de kullanildigini gosteren kodu yaziniz
        //        " A Java  vah Java sensiz olmuyor Java"
        // indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) indexini almis olursunuz

        String u = " A Java  vah Java sensiz olmuyor Java";
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava); //3

        // indexof methodu olmayan karakter icin kullanilirsa her zaman "-1" verir
        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz);// -1

        // Ex8: bir string'de a, e, i karakterlerinin "son"  gorumlerinin indexleri toplamini ekrana yazdiriniz
        //          "Java is easy to learn" ==> 18+5+17 = 40
        String v = "Java is easy to learn";

        int idxOfA = v.lastIndexOf('a');
        System.out.println(idxOfA);//18

        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI);//5

        int idxOfE = v.lastIndexOf('e');
        System.out.println(idxOfE);//17

        System.out.println(idxOfA + idxOfE + idxOfI);//40

        //Note: lastIndexOf() String olmayan bir character icin kullanilirsa her zaman "-1" verir
        //Ex9: Bir String'deki tekrarsiz character'leri ekrana yazdiriniz
        //         abbccdc==> ad
        String y = "abbccdc";
        char ch1 = y.charAt(0);
        if (y.indexOf(ch1) == y.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }


        char ch2 = y.charAt(1);
        if (y.indexOf(ch2) == y.lastIndexOf(ch2)) {
            System.out.println(ch2);
        }

        char ch3 = y.charAt(2);
        if (y.indexOf(ch3) == y.lastIndexOf(ch3)) {
            System.out.println(ch3);//C

        }


        // Note: Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
        // Bazi kodlari bazi sartlara gore aktive etmek icin " if statement( java cumlesi)" kullanilir

        //   if you study hard , you will learn Java


        // Ex10: Sayi pozitif ise ekrana cift yazdirin
        int num = -12;

        if (num > 0) {
            System.out.println("Pozitif");
        }
        // Ex11: Sayi -1 ile 10 arasinda ise ekrana rakam yazdirin.

        int number = 3;
        if (number > -1 && number < 10) {
            System.out.println("Rakam");

        }
        // Ex12: Sayi 3 basamakli ise "Woow!" yazdirin.
        int n = -123;
        n = Math.abs(n);
        if (n > 99 && n < 1000) {
            System.out.println("Woow!");

        }


    }

}
