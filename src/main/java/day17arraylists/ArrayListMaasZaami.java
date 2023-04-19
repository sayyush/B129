package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMaasZaami {

    public static void main(String[] args) {

        //Example 2: Maas List'i olusturunuz ve maaslara %20 zam yapiniz.
        List<Double> salary = new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);


        // 1. YOL
        int idx = 0;
        for (Double w : salary) {  // for each loop kullanmak daha mantikli
            salary.set(idx, w * 1.20);
            idx++;
        }
        System.out.println( salary);

        //2.YOL:
        for (int i=0; i<salary.size(); i++){
            salary.set(i, salary.get(i)*1.20);
        }
        System.out.println(salary);   // hepsi dogru sadece 2. yolda yine bir defa arttirdi fiyati




    }
}
