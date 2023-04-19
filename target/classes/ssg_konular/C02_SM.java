package ssg_konular;

public class C02_SM {
    public static void main(String[] args) {


     /*
        Soru 2)Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
       "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor"
        iki kelimeyi de iceriyorsa karar ver buyuk mu yazdirayim, kucuk mu?yazdirin.
         */

    String str="Java buyuk dunya kucucuk";
    str=str.toLowerCase();
        if (str.contains("buyuk")&&(str.contains("kucuk"))){
        System.out.println("karar ver buyuk mu yazdirayim, kucuk mu?");

    } else if (str.contains("kucuk")) {
        System.out.println(str.toLowerCase());

    } else if (str.contains("buyuk")) {
        System.out.println(str.toUpperCase());


    }else
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");


}
}
