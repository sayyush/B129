package day04memorykullanimwrapperclassascii;

public class C02_AsciiDegerleri {
    /*
    ASCII= Amerikan standart Kodlama Sistemi uluslararasi kabul gormus degerlerdir.

    Klavyemizde kullandigimiz harf ve sembollerin matamatiksel karsiligi char data turunde isleme alinirsa
    o char degerinin ASCII TABLE'daki karsiligini isleme alir
    Harf ve sembollere deger atar
    Karakterlerin cebirsel karsiligini bulmak icin ortaya cikmistir.
    Cunku bilgisayararda hersey 10101000001 lardan
    olusur, bu yapiya cevirebilmek icin ASCII TABLE olusturulmustur.
    Buyuk harflerin ascii degeri kucuk harflerin ascii degerinden daha kucuktur

    ASCII TABLE CHAR'LARA AITTIR
     */
    public static void main(String[] args) {

        // Bir tam sayiyla bir harfi toplayiniz

        int deger= 20;
        char harf='a';

        //1. yol

        int sum= deger+ harf;// 20+97
        System.out.println("Bir tam sayi ile harfin toplami="+ sum);//117
        //2.yol
        System.out.println("2.Yol Toplam"+(deger+harf));//117





        char rakam1='1';
        System.out.println("rakam1 ="+rakam1);//1

        char rakam2='2';
        System.out.println("rakam2="+rakam2);//2

        char rakam3='3';
        System.out.println("rakam3="+rakam3);//3

        char rakam4='4';
        System.out.println("rakam4="+rakam4);//4

        System.out.println("rakam1+rakam2+rakam3+rakam4="+rakam1+rakam2+rakam3+rakam4);
        //1234 eger r1+r2+r3+r4 diye yan
        // yan yana yazarsaniz parantez kullanmadan.,o zaman sonuc 1234 olur yan yana yazar, toplam islemi yapmaz
        //  CONCATENATION islemi birlestirme yapar

        System.out.println("rakam1+rakam2+rakam3+rakam4 ASCII toplam ="+(rakam1+rakam2+rakam3+rakam4));//202



        char kh='a';
        char bh='A';
        System.out.println("a'nin Ascii Degeri="+(kh+0));

        System.out.println("A="+(bh+0));


        System.out.println("kh>bh="+(kh>bh));// karsilastirma islemlerinin sonucu true yada false doner.

        // Herhangi bir karakterin ascii degerini hesaplatalim.
       // 1. YOL
        char space=' ';
        System.out.println("space'in ascii degeri="+(space+0));
      // 2. YOL
        int hrf= 'm';


        // char data type'larinda Java karaktere integer degerde atanabilir,
        // cunku char data type'nin bir resim birde asciiden gelen integer degeri vardir
        // Bu sekilde Ascii degerini bulabiliriz.
        System.out.println("integer harfin ascii degeri="+hrf);

        // *******Ascii degerlerinden yararlanarak karsilastirma yapabiliriz***************\\\\
        byte b= 125;
        float f= 2.45648f;
        long l= 54561255111144L;
        char ch= 'h';

        System.out.println(l>ch);//true
        System.out.println(b<f);// false
        System.out.println(b<ch);// false




    }
}
