package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {


       // Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz

        //           3==> 3*1=3   3*2=6 .....

        Scanner input= new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz");
        int num=input.nextInt();

        int i = 1;
        while(i<11){

            System.out.println(num + "x" + i + "=" + (num*i));

            i++;
        }

        System.out.println();


        // Ex2: Verilen bir String'de her harfin sonrasinda "*" sembolunu ekleyiniz
        //      Java==> J*a*v*a*

        System.out.println("Bir kelime giriniz");
        String word = input.next();
        String newWord = "";

        int k = 0;

        while(k<word.length()){

            newWord = newWord + word.charAt(k) + "*";
            k++;

        }
        System.out.println(newWord);






    }
}
