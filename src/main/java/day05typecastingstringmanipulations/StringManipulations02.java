package day05typecastingstringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {
        String s = "Learn Java earn money";

        //   Ex 1: "s" String'inin "money" ile bitip bitmedigini kontrol ediniz.
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

// Ex2: "s" String'deki "money" kelimesini "dollar" kelimesine ceviriniz.
        String s1 = s.replace("money", "dollar");
        System.out.println(s1);// Learn Java earn dollar

// Ex3:  "s" String'deki "money" kelimesini "win" kelimesine ceviriniz.
        String s2 = s.replace("earn", "win");
        System.out.println(s2);// Lwin Java win money

        // Ex4:  "s" String'deki "a" kelimesini "*" kelimesine ceviriniz.
        // NOTE: replace() methodun coklu character ile calisirsaniz mecbur cift tirnak kullanacaksiniz.
        // Ama tek character tek character ile calisirsaniz cift tirnak veya tek tirnak kullanabvilirsiniz
        String s3 = s.replace("a", "*");
        System.out.println(s3);

        // Note: Ama ya ikiside cift tirnak  olmalidir, yada ikiside tek tirnak olmalidir
        // Ex5:  "s" String'deki "n" kelimesini "XXX" kelimesine ceviriniz.
        String s4 = s.replace("n", "XXX");
        System.out.println(s4);

        // Ex6: "s" String'deki tum "e" harflerini siliniz.
        // NOTE: Hicbir sey char data typede yokbu yuzden replace() methodu kullanarak silme islemi yaparsaniz mutlaka cift tirnak kullaniniz.
        String s5 = s.replace("e", "");
        System.out.println(s5); // Larn Java arn mony

        String t = "Ali 13 yasindadir!...";
        // Ex7:"t" String'deki tum rakamlari (0123456789) "*" a ceviriniz.   //RAKAMLAR HARF,
        // NOTE: Bir grup data'yi degistirmek icin replaceAll() kullanilir
        // bir grup datayi ifade etmek icin REGULAR EXPRESSIONS(regex) kullaniriz
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);

      /*

         MESHUR REGEX"ler
        1) eger tum rakamlari==> [0-9}
        2) tum kucuk harfler==> [a-z]
        3) tum buyuk harfler [A-Z]
        4) tum kucuk harfler ve buyuk harfler [[a-zA-Z]
        5) tum harfler ve rakamlar==> [a-zA-Z0-9]
        6) tum noktalama isaretleri ==>   \\p{Punct}            EZBERRRRRRRR
        7) tum sesli harfler ==>[aeiouAEIOU]
        8) x, q, w harfleri ==> [xqw]
        9) Kucuk harflerden farkli tum karakterler==> [^a-z]- den farkli demek
        10) Tum harflerden farkli tum karakterler==> [^a-zA-Z]- tum harflerden farkli

       */

        // Ex 8 :"t" String'deki tum rakamlari ve harfleri  "!" a ceviriniz.
        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);


        // Ex 9 :"t" String'deki tum sesli harfleri  "?" a ceviriniz.
        String t3 = t.replaceAll("[aeiouAEIOU]", "!");
        System.out.println(t3);
        // Ex 10: "t" String'deki kucuk harfler disindaki tum karakterleri "<>" ceviriniz

        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);

        // Ex 11: "t" String'deki tum  harfler disindaki tum karakterleri "+" ceviriniz
        String t5 = t.replaceAll("[^a-zA-Z]", "a");
        System.out.println(t5);

        // Ex 11: "t" String'deki  space'ler disindaki  tum karakterleri "$" ceviriniz
        String t6 = t.replaceAll("[^ ]", "+");
        System.out.println(t6);
        // Ex 13:  "t" String'deki sesli harfler'ler  disindaki  tum karakterleri "&" ceviriniz
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);


    }

}
