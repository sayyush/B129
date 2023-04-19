package day02datatypesmethodcreation;

public class Variables01 {

    //primitive data types-->char - boolean - byte - short - int - long - float - double
    //float: Virgullu sayilar(ondalik sayi - decimal numbers )icin kullanilir. (fiyatlandirmalarda kullanilir - 12.99)
    //double: Virgullu sayilar(ondalik sayi - decimal numbers )icin kullanilir. (hucre agirligi: 0.0000000012)

    //INTERVIEW SORULARI:
    // Note1: primitve data type'lerini java olusturmustur, biz olusturamayiz.
    // Note2:primitve data type'lerinin isimlerinde sadece KUCUK  harf kullanilir
    // Note3: primitve data'lar data type'lara gore memory de farkli farkli yer kaplar.
    // Note4:primitive datalar iclerinde sadece sizin atadiginiz degeri barindirir
    public static void main(String[] args) {

        //ornek 1: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz.
        // java "decimal numbers"i otamatik olarak double kabul eder.
        // //siz data tipini float yazarsaniz hata verir.
        // Float olmasinda israr ediyorsaniz sonuna "F" koymalisiniz
       // float memoryda 4 byte yer kaplar, double 8 byte yer kaplar.
        float shirtPrice =12.99F;
        float shoesPrice =15.89F;

        System.out.println(shirtPrice + shoesPrice);
        // ln kullanmak daha iyi
        System.out.println(shirtPrice);

        // System.out.println() ekrana yazdirir ve "pointer"i bir sonraki satira koyar
        //System.out.println() ekrana yazdirir ve pointer(KALEM) i ayni satirda tutar
        //System.out.println() yazdirmanin kisa yolu ==> sout yaz ve enter bas

        // ekrana kod yazdirma [ System.out.println(ln= line nin kisaltilmasi) - sistemde var olan bilgileri disari yazdir]
        // println - sonraki satira yaz demek gibi)

        // ornek 2: hucre agirligi ve Amip'in agirligi icin iki tane variable olusturun ve agirligi farkini ekrana yazdirin

        double weightCell = 0.000000000000112;
        double weightAmip = 0.000000000000023;
        System.out.println(weightCell-weightAmip);//8.9E-14 ==>0.000000000000089  "8.9 carpi 10 uzeri -14" "E== Exponent" (exponential number ustlu sayilar)

    }
}


 /*
        Javada method nasil olusturulur?
    1) Main methodun disinda olusturulur
    2)access modifier+ return type +method ismi+()+{}

    //olusturulan nethod'lar nasil kullanilir?
    1) main method"un icinden kullanilir
     2) methodun ismini + () yazin
     3) islem yapacaginiz sayilari parantezin icine koyun

     */
