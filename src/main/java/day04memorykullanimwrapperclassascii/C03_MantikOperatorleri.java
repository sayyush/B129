package day04memorykullanimwrapperclassascii;

public class C03_MantikOperatorleri {

    // java 3lu karsilastirma yapamiyor
    //10< sayi MantikOperatoru sayi <20;
    // == Esittir icin cift == kullanilir.
    // = tek esittir atama(assignment operator) uapar

    /*
    Java 3lu karsilastirma kabul etmez
    ikili karsilasatirma yapip MANTIK OPERATORLERIYLE birlestirmeliyiz


    &&== VE AND
    || OR  operatoru VEYA demek.
    &&

    Cay   VE(AND)   Limon       mukemmelliyetci
      +      &&        +     = TRUE
      +      &&        -     = FALSE
      -      &&        +     = FALSE
      -      &&        -     = FALSE


    && ile &
    && 'de boolean sonucta bir tane false bulunca durur
    &'de ise tum kodu tarar bulsada bulmasada tarar, sonra durur
    Buda &&'ni &'den daha hizli calismasini saglar.


    || veya operatoru Polyanacidir. En ufak bir pozitiflikten true doner.

      Cay   VEYA(OR)   Limon
       +    ||      +     = true
       +    ||      -     = true
       -    ||      +      = true
       -    ||      -      = false

     */

    public static void main(String[] args) {
        System.out.println(5+2== 8); // false


        boolean sonuc1 = 5>4 && 7<9 && 6+3 ==9 && 5+2 != 8;  // != ==>  ikisini kullanirsan esit degildir demek
        System.out.println(sonuc1); //true

        boolean sonuc2= 5>4 && 7>9 && 6+3== 9 && 5+2==7;
        System.out.println(sonuc2); //false

        int sayi1= 15;

        System.out.println(10< sayi1 && sayi1< 20); //true

        int sayi2= 5;
        System.out.println(sayi2<10 || sayi2> 20);// true







    }


}
