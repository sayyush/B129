package sorucozmeday01;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

        /*   Ex 1 : Kullanicidan baslangic ve bitis degerlerini alin
           Baslangic degerinden baslayip  bitis degerine kadar tum tamsayilari ekrana yazdiriniz

        */

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen baslangic degeri giriniz...");
        int baslangic =input.nextInt();

        System.out.println("Lutfen bitits degeri giriniz...");
        int bitis= input.nextInt();

        if(baslangic>bitis){
            System.out.println("Verdiginiz baslangic degeri bitis degerinden kucuk olmali...");

        }else{
            for(int i=baslangic; i<=bitis; i++){
                System.out.print(i+ " ");
            }
        }

        System.out.println(

        );
/*   Ex 1 : Kullanicidan baslangic ve bitis degerlerini alin
           Baslangic degerinden baslayip  bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
//    ODEV
        */

        System.out.println("Lutfen baslangic degerini giriniz");
        int baslangic1 = input.nextInt();
        System.out.println("Lutfen bitis degerini giriniz");
        int bitis1= input.nextInt();

        if(baslangic1 > bitis1){
            System.out.println("Baslangic degeriniz bitisten kucuk olmali");
        }  else{
            for(int i1=baslangic1; i1<=bitis1; i1++){
                if(i1%2==0){
                    System.out.print(i1+ " ");
        }

                }
            }
        }







    }

