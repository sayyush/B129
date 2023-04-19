package sorucozmeday01;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {




       //Array'e eleman ekleme nasil yapilir?
        String stdNames[]=new String[5];
        stdNames[0] = "Ajda";
        stdNames[1] = "Cuneyt";
        stdNames[2] = "Kemal";
        stdNames[3] = "Ezel";
        stdNames[4] = "Besir";

        System.out.println(Arrays.toString(stdNames)); // [Cuneyt, Kemal, Ajda, Ezel, Besir]


        System.out.println(stdNames[0].length() + stdNames[stdNames.length-1].length());

        //Example 2: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.
        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Athena";

        int totalchar= 0;


    for(int i=0; i<brr.length;        i++){

        totalchar= totalchar+ brr[i].length();
    }
        System.out.println(totalchar);



   // for-each loop


        int sum= 0;
        for(String w: brr ){
            sum= sum + w.length();

        }
        System.out.println(sum);












    }}