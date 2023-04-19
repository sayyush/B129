package day11forloop;

public class ForLoop02 {

    public static void main(String[] args) {
        // Ex 1 : Verilen bir String'de 'a' character'i haric tum characterleri yazdiriniz
        // "Madagaskar" ==> Mdgskr

        String s = "Madagaskar";

        // 1.yol
        String t = s.replace("a", "");
        System.out.print(t);


        System.out.println();
        // 2. yol
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != 'a') {

                System.out.print(ch);
            }
        }


        System.out.println();

        // 3. yol:
        for (int i1 = 0; i1 < s.length(); i1++) {
            char ch = s.charAt(i1);
            if (ch == 'a') {
                continue;    // continue keyword'u bazi sartlar icin loop'un adimlarini atlamamizi saglar

            }

            System.out.print(ch);
        }


    }}

// karakter a ise bos ver
// continue : bos ver onu gec onu   gormezden gel demek sur gitsin









