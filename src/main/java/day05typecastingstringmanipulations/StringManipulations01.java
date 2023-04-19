package day05typecastingstringmanipulations;

public class StringManipulations01 {
    // String bir non- primitive data type'dir ve ayni zamanda bir class'dir.
    public static void main(String[] args) {

        String s = "Java is easy";

        //Example 1: "s" String'deki tum character'leri buyuk harf yapiniz
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);// JAVA IS EASY


        //Example 2: "s" String'deki tum character'leri kucuk harf yapiniz
        String sLower = s.toLowerCase();
        System.out.println(sLower);

        //Example 3: "s" String'deki ilk character'leri aliniz
        char firstChar = s.charAt(0);
        System.out.println(firstChar);


        //Example 4: "s" String'deki ikinci ve sondan ikinci character'i aliniz ve ekrana yanyana yazdiriniz
        // Bosluk java icin bir karakterdir.
        char secondChar = s.charAt(1);
        s.charAt(10);
        char secondLastChar = s.charAt(10);

        // 1. yol ayni satirda yazdirmak icn
        System.out.print(secondChar);
        System.out.println(secondLastChar);

        // 2. yol; ayni satirda yazdirmak icin
        System.out.println("" + secondChar + secondLastChar);
        // Ex 5:  "s" String'de kullanilan character sayisini bulunuz.
        int sLength = s.length();
        System.out.println(sLength);

        // Example 6 : "s" String'deki ilk 4 characteri aliniz.
        // onemli. Substring(0,4)==> 0 yani ilk index dahil, 4 yani ikinci index haric dir.
        String sub1 = s.substring(0, 4);
        System.out.println(sub1);
      // Example 7: "s" String'deki "is" aliniz.
        String sub2 = s.substring(5, 7);
        System.out.println(sub2);

        // Example 8: "s" String'deki easy characteri aliniz.
        String sub3 = s.substring(8, 12);
        System.out.println(sub3);

        // Bir character'den baslayip String'in sonuna kadar almak isterseniz, ikinci index'i yazmayiniz
        //substring (8,12) yerine substring(8) yaziniz
        String sub4 = s.substring(8);
        System.out.println(sub4);

        //Ex9: "s" string'de money kelimesinin var olup olmadigini kontrole ediniz
        boolean isExist = s.contains("money");
        System.out.println(isExist);
        /*
        Bir method ogrenirken 3 seyi ogrenin
        1) bu method ne is yapar?
        2) Bu methodun farkli kullanimlari nasildir?
        3) Bu method size ne return eder?

         */

        // Ex 10: "s" string'nin belli bir harfle baslayip baslamadigini kontrol ediniz

        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);//

        // Ex 11: "s" string'nin 6. character'den itibaren belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isBegin = s.startsWith("1", 5);
        System.out.println(isBegin);

        //JAVA KUCUK BUYUK HARFLERE COK DUYARLI
        // INDEX sorarsa sifirdan basliyor
        //CHARACTER sorarsa 1den normal saymayla basliyor


    }
}
