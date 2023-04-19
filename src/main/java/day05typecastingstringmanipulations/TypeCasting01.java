package day05typecastingstringmanipulations;

public class TypeCasting01 {


    public static void main(String[] args) {
       /*
        Numeric primitive data type'larinin birbirine donusturulmesine "Type Casting" denir.

        Numeric(Sayisal) Data Type'lar byte - short - int - long - float - double

        Note 1: Kucuk data type'larini buyuk data type'larina cevirmeyi Java otomatik olarak yapabilir.
                Bu isleme "AutoWidening"(Otomatik Genisletme) denir.

        Note 2: Buyuk data type'larini kucuk data type'larina cevirmek riskli bir istir, Java bu riskli isi otomatik olarak yapmaz.
                Bu islemi kod yazan'lar yapar.
                Bu isleme "ExplicitNarrowing"(Aciktan daraltma) denir.
     */

      // Ex1:  byte data tipini int data tipine ceviriniz

         byte age= 13;
         int ageInt= age; // AutoWidening

      // Ex2: Long data tipini short data tipine ceviriniz

        long weight= 234;
        short weightInt= (short)weight;//ExplicitNarrowing


      // Ex3: int data tipini float data tipine ceviriniz

        int population= 700000;
        System.out.println(population);

        float populationFloat= population;
        System.out.println(populationFloat);

        // Ex4: double data tipini short data tipine ceviriniz

        double number= 12.934;
        System.out.println(number);

        short numberShort =(short)number;
        System.out.println(numberShort);

        // dikkat!
       // Donusum yaptiginiz sayi(260), donuseceginiz data tipinin sinirlari disinda ise,
      // Java kullandiginiz sayi ile " mod" islemi yapar ve sonucu sizin yeni degeriniz olur



         short num= 260;
        System.out.println(num);// 260

        byte numByte= (byte)num;
        System.out.println(numByte); //4


      // ex2:

      short n= 1023;
      System.out.println(n);// 1023

      byte nByte = (byte)n;
      System.out.println(nByte);//-1








    }
}
