package ssg_konular;

public class C05_SM {
    public static void main(String[] args) {

          /*
         Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
         ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
         yazdırınız.
         */

        String sehirIsmi="angara";
        String str=sehirIsmi.trim().toLowerCase();
        str=str.substring(0,1).toUpperCase()+str.substring(1);
        System.out.println(str);
    }
}
