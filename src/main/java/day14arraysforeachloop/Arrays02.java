package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

       // Ex 2: Integer array olusturnuz, icine 6 tane eleman yerlestiriniz,
        // bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

     int ages[] = new int[6];
     ages[0]= 20;
     ages[1]=23;
     ages[2]=19;
     ages[3]=44;
     ages[4]=15;
     ages[5]=32;

        System.out.println(Arrays.toString(ages)); // [12, 23, 19, 44, 15, 32]

        // sort methodu array'deki elemanlari kucukten buyuge dizer
        // SORT - (v) siralamak demek,  (n)cesit cins tur

        Arrays.sort(ages);    // sort Javayi cok yorar her zaman siralama javayi yavaslatir,
                             // sort'dan uzak durmaya calisiriz

        System.out.println(Arrays.toString(ages));// [15, 19, 20, 23, 32, 44]
        System.out.println(ages[0] + ages[ages.length-1]);// 59

        // 2.YOL

        int minimum = ages[0];
        int maximum = ages[0];


        for(int w :ages){

        minimum= Math.min(minimum,w);


        maximum= Math.min(maximum,w);
        }
        System.out.println(minimum + maximum); // 59


    }
}
