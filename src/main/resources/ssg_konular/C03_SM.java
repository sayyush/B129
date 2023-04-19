package ssg_konular;

public class C03_SM {
    public static void main(String[] args) {



         /*
        soru 3)Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        karakter sayısının toplamını yazdırınız.
        */

        String isim1="omer faruk";
        String isim2="utku can";
        String isim3="mehmet ali";

        int a1=isim1.replaceAll("\\s","").length();
        int a2=isim2.replaceAll("\\s","").length();
        int a3=isim3.replaceAll("\\s","").length();

        System.out.println("toplam karakter sayısı : "+(a1+a2+a3));

    }
    }


