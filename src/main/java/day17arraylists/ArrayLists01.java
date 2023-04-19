package day17arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists01 {
    public static void main(String[] args) {

      //  interview sorusu
        // Array kati, List esnek yapiya sahip

       /* Array ile ArrayList'in farki nedir?

        1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini
             soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
                Array'ler eleman sayisinda "fixed" dirler.
             ArrayList'leri olustururken eleman sayisi soylemeye gerek yok,
             cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.
        2)Array'lerin icine "primitive" ve "reference" lar konabilir.
            ArrayList'lerin icine ise sadece "non-primitive" ler konulur.
        3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.
            Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin
            Array kullaniriz, ama eleman sayisi degisken olan coklu datalar icin
            Array kullanma riskini almayin
            Listler gelismis yapi array'lere gore


*/

 /*
     1) ArrayList(List)'ler coklu data depolamak icin kullanilir.
     2) ArrayList(List)'ler non-primitive data type'inda ki coklu datalari depolamak icin kullanilir.
        List'ler "non-primitive" data kabul ederler, "Array" ler ise "primitive" data veya reference kabul eder.
     3) ArrayList(List)'leri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.
        List'ler eleman sayisinda "flexible" dirlar ama "Array"ler "flexible" degildirler.
     4) Madem "Array" ler eleman sayisinda flexible degil nicin Java "Array" leri iptal etmedi?
          i) Eleman sayisi belli olan data'lari depolamak icin Array'ler tercih edilir.
          ii) Array'ler cok hizli calisir.
          iii) Array'ler memory'de cok az yer kaplar.
    */



            //List nasil olusturulur ?
            ArrayList<Integer> ages = new ArrayList<>();  // new sifirdan yarat demek  //== den sonraki ArrayList constructor
            System.out.println(ages);//[]

            //List'lere eleman nasil eklenir?
            //List'e eleman eklemek icin add() methodunu kullaniriz.
            //add() methodu elemanlari sizin verdiginiz sirada "list" 'e ekler.(Insertion Order sizin icine sokma siraniza java saygi duyuyor)
            ages.add(9);
            ages.add(12);
            ages.add(10);
            ages.add(888);
            ages.add(1,656);
            ages.add(3,777);

            System.out.println(ages);//[9, 656, 12, 777, 10, 888]

            //List' coklu eleman nasil eklenir? veya List'e baska bir List nasil eklenir?
            //Bir List'e coklu eleman eklemek icin o elemanlari once bir List'in icine koymalisiniz.
            ArrayList<Integer>newAges = new ArrayList<>();
            newAges.add(8);
            newAges.add(9);
            newAges.add(10);

            ages.addAll(newAges);//[9, 656, 12, 777, 10, 888, 8, 9, 10]
            ages.addAll(2,newAges);//[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]
            System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

           //Bir List'teki tum elemanlari nasil silebilirim? clear()
            ages.clear();
            System.out.println(ages);//[]


            //Bir elemanin List'te var olup olmadigini nasil kontrol ederiz? contains()
            boolean r =  ages.contains(656);
            System.out.println(r);// false verecek cunku ustte clear methodu kullandigin icin,
                                 // egerde clear methodunu kapatip contains methodu kullansan sana true verecek

            //Bir List'in baska bir List ile ayni olup olmadigini nasil kontrol ederiz? equals()
            // 2 List'in esit olmasi icin ayni index'de ayni elemanlar olmalidir
            ArrayList<String> names1 = new ArrayList<>();
            names1.add("Tom");
            names1.add("Jim");
            names1.add("Kim");

            ArrayList<String> names2 = new ArrayList<>();
            names2.add("Tom");
            names2.add("Kim");
            names2.add("Jim");
            boolean s=names1.equals(names2);
            System.out.println(s); // false


            //Example 1: Verilen iki Integer List'te tamamiyla ayni elemanlarin olup olmadigini
//           kontrol eden kodu yaziniz. 2 List'teki elemanlar ayni olmali onu istiyor
            ArrayList<Integer>nums1 = new ArrayList<>();
            nums1.add(8);
            nums1.add(10);
            nums1.add(9);

            ArrayList<Integer>nums2 = new ArrayList<>();
            nums2.add(8);
            nums2.add(9);
            nums2.add(10);

            Collections.sort(nums1);

            Collections.sort(nums2);

            boolean t= nums1.equals(nums2);
            System.out.println(t); // true



        }
}
