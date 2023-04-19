package day02datatypesmethodcreation;

public class Variables02 {

    /*
    Non-Primitive Data Type: String bir non-primitive dir, non primitiveler sinirsizdir
                             Uretilen her bir class ayni zamanda bir "non primitive data type"dir
                             Bu yuzden "non-primitive data type" lar sinirsiz sayidadirlar.
                             Non primitive data type'larin isimleri BUYUK harfle baslar.
                             Non primitive data type'larin tamami icin java memory'de ayni miktarda yer ayirir.


   Interview sorusu: "primitive ve non- primitive data typelarin arasindaki fark nedir?
                             1) primitive ler sadece bizim atadigimiz degeri icerir.
                                 non primitive ler bizim atadigimiz deger ve method'lar icerir.
                             2) primitiveler KUCUK harfle baslar, non primitiveler BUYUK harfle baslar
                             3) primitiveleri Java uretmistir ve 8 tanedir
                                non primitiveleri Java ve developerlar uretebilir, sinirsiz sayidadir.
                            4) primitive ler memoryde data type ina gore yer kaplar,
                               non primitive ler icin Java memoryde hep ayni buyuklukte yer ayirir

     */
    public static void main(String[] args) {
        // ornek 1: Sehir ismi icin bir variable olusturun ve bir deger atayip onu ekrana yazdir
        String cityName ="Miami";
        System.out.println(cityName);
    }
}
