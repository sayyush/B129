package day28exceptions;

public class Exceptions01 {

   /*
      Exceptions  - umulmadik problem.
      1) Exception - beklenmedik problem, seyahette benzinin bitmesi arabanin bozulmasi gibi...
      2) Gercek hayatta karsilastigimiz beklenmedik problemler icin cozum yollarimiz vardir.
         Mesela benzin bitince Yol yardim'i arariz.
         Application'larda da beklenmedik problemler icin cozum yollari uretmeliyiz, bu isleme "Exception Handling" denir.
      3) Exception'lar temel olarak ikiye ayrilirlar:
             i)  Compile Time Exception : Siz code yazarken farkedilir ve yazdiginiz code'un alti  kirmizi cizgi ile cizilir.
             ii) Run Time Exception : Siz code yazarken farkedilmez ama, code'u calistirdiginizda console'da hata alirsiniz.
                Daha sinsidir.
      4) Exception'lar disinda "Error" diye adlandirdigimiz "Handle" edilemeyen problemler vardir.
         Gercek hayatta soforun olmesi gibi, handle edilemeyecek durumlar "Error" dur.
         Application'larda "Memory" nin dolmasi "Error" dur.
         Iki tur memory var i) Stack Memory dolarsa "StackOverFlow Error" alirsiniz.
                            ii) Heap Memory dolarsa " OutOfMemory Error" alirsiniz.

                     ****** MESHUR INTERVIEW SORUSU    *****
      Yazdiginiz code calismadginda olusan problemi  bulmak icin naparsiniz?
       Log'lara (console'da verilen mesajlar) bakariz
      Run Time Exception OLUSTUDUGUNDA DIKKAT ETMEMIZ GEREKEN SEYLER:
        1) Exception ismi : (ArithmeticException)
        2) Exception'da aldiginiz mesaj.  (/ by zero)
        3)  Exception olustugu yerler:
         (at day28exceptions.Exceptions01.divide       (Exceptions01.java:29))
             28.packgae'da   class ismi   method ismi   satir ismi.


    */

    public static void main(String[] args) {

        int a = 12;
        int b = 0;
        divide(a, b);
    }

   // ArithmeticException yazdiginiz code'da matematiksel islem kullaniyorsaniz alinabilecek bir Exception'dir.
    public static void divide(int a, int b) {
        try {  // dene
            System.out.println(a / b);
            System.out.println("I am here");    // burasi calismaz
        } catch (ArithmeticException e) {       // e diye isim verdik     // dene yapamazsan, ben yakaliycam
            System.out.println("Do not divide by zero");
        }
        System.out.println("You are here");
    }


    // Exception Handling'de if- else kullanilmaz.

    public static void divide2(int a, int b) {
        if (b == 0) {
            System.out.println("Do not divide by zero");
        } else {
            System.out.println(a / b);
        }
    }

    // try catch'in if else ile farki nedir?
    //  ilki matamatikle alakali her turlu problemi yakalayabiliyor.
    // Neden if else kullanmiyorsun derse interviewda?
    // egerde ben if else kullanirsam olusabilecek muhtemel problemleri birer birer if parantezinin icine benim yazmam gerekir,
    // Bu da ciddi bir matematik bilgisi gerektirir, ve yazacagimiz kodu cok uzatir, ama
    // try catch'de arithmeticException dersem Java butun matematigi bildigi icin muhtemel butun problemi yakalar.


}

