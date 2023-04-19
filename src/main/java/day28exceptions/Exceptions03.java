package day28exceptions;

public class Exceptions03 {

    public static void main(String[] args) {

        String s = "Java";
        getCharFromString(s, 2);
        getCharFromString(s, 4);

    }

    // String'lerde var olmayan index'ler kullanildiginda Java StringIndexOutOfBoundsException atar.
    public static void getCharFromString(String s, int idx) {
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("Olmayan index kullanma hatasi yaptiniz..." + e.getMessage()); // Olmayan index kullanma hatasi yaptiniz...String index out of range: 4

            e.printStackTrace();// Handle etmeden once aldiginiz mesaji yazar.
            System.out.println( e.getCause()); // null    hatanin sebebi hakkinda birseyler soyluyor.

        }


    }
}



/*

StringIndexOutOfBoundsException - String'de index kullanirken sinirlarin disina ciktin bu bir hatadir.
range - aralik demek  1'den 100e kadar range mesela.
 */