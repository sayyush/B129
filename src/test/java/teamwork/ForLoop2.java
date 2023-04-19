package teamwork;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {


        // Soru 10. FOR LOOP  Kullanicidan iki sayi isteyin.
        // Girilen sayilar ve aralarindaki tum sayilari toplayip, sonucu yazdiran bir program yaziniz

        Scanner input=new Scanner(System.in);

        System.out.println("ilk sayiyi giriniz");//ilk 1
        int ilk=input.nextInt();

        System.out.println("son sayiyi giriniz");  // son sayı 5
        int son=input.nextInt();

        if(ilk>son){
            System.out.println("ilk sayi kucuk olmalı");

        } else {int sum=0;

            for(int i=ilk; i<=son; i++){

                sum=sum+i;

            }
            System.out.println(sum);

        }

    }
}
