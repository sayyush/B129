package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {


        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.

        // ARRAY oluturmak icin: 1) array'deki elemanlarin data tipini yazmaliyiz
        //                       2) array'e isim vermeliyiz(genellikle " arr" kullanilir) // arr[]
        //                       3) new String[eleman sayisini yaz]      *** String arr[] = new String[];***


        // STRING 'erde length() , parantezli     ARRAY'lerde length parantezsiz kullanilir
        String arr[] = new String[5];
        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";
        System.out.println(Arrays.toString(arr));// [Math, Science, Music, English, Art] // array yazdirmak icin bir method

        System.out.println(arr[0].length() + arr[arr.length-1].length());// 7    // butun arrayler icin calisir

        //Example 2: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.
        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Athena";

        //1.Yol: for-loop
        int totalChar = 0;

        for(int i=0; i<brr.length; i++){
            totalChar = totalChar + brr[i].length();
        }
        System.out.println(totalChar);// 32

        //2.Yol: for-each-loop(enhanced(zenginlestirilmis) loop) ==> baslangic degeri, loop'un calisma sarti,
        // ve increment/decrement kismini kendisi halleder.

        //       for-each-loop "Array" lerde ve "Collection" larda kullanilir.
        //       Index kullanmaniz gerektiginde bazen "for-each-loop" caresiz kalir, mecburen diger loop'lari kullaniriz.

        int sum = 0;
        // Miami, Istanbul, Frankfurt, Dhaka, Athena
        for(String w : brr){
            sum = sum + w.length();
        }
        System.out.println(sum);//33
    }   // FOR-EACH-LOOP' sintezi: for(String w: brr){}  ==> 1.eleman data tipi, 2) w: 3) array'in ismi



    }
