package day09incrimentdecrementternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {



    // Ex1:
     int a= 10;
     int b= 20;

    int r1= a<7 ? a++ : ++b;

        System.out.println(r1);//21

        System.out.println(a);//10

        System.out.println(b);//21


     // Ex2: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
     //      -4 ==> -1*-4        4==>4        0==> 0

        int c = -4;

       int r2 = c<0 ? -1*c : c;

        System.out.println(r2);// 4

       //Ex 3 : Iki sayinin isareti ayni ise bu sayilari carpan ,
       // isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz

        int m = 5;
        int n = -6;
        // "OBJECT" javada butun "nON- PRIMITIVE DATA TYPE"(CLASS) larinin  ortak PARENT'tidir.
        //"OBJECT" in PARENT'i yoktur.
        // Farkli data type'lari icin ortak bir variable olusturmak istediginizde, data type olarak object kullanabilirsiniz.
        // Java'da "OBJECT" , insanlik aleminde "Hz.Adem" e benzer.

      Object r3 = ( m>0 && n>0)  ||  ( m<0 && n<0) ? a*b : "Farkli isaretli sayilari carpamiyorum";
        System.out.println(r3);

        // Ex4: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        int p = 234;
        p=Math.abs(p);

       String r4= p>99 && p<1000 ? p + "uc basamakli" : p + "uc basamakli degil";
        System.out.println(r4);

        //// ******* () SKOBKANYN ICINI HER ZAMAN SADE VE AZ YAZMAMIZ GEREKIYOR YAZmazsan ELESTIRIRLER


















    }
}
