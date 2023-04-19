package day10switchloops;

public class Loops01 {
    /*

    CODE STANDARTS :
    1) repetition olmamalidir
    2) Dynamic olmalidir. biri 5 kere sonra 5000 kere yaz dese napican,rahat bir sekilde 5000e gecebilmelisiniz
    // yazdigin kod degisime acik olmalidir
    3) Tamir (fix) ve update(gelistirme) kolay yapilabilmelidir

     bir isi yapiyorsunuz nasil yaptiginizda onemli

     */

    public static void main(String[] args) {

        //Ex 1 : Ekrana 5 kere "Hi" yazdiriniz.

        // 1.YOL tavsiye edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        // 2. YOL :
        // Ayni adimlar tekrar tekrar yapilmasi gerektiginde " LOOP" kullanilir

        // 4 TANE loop VAR ==> 1) FOR- LOOP 2) WHILE- LOOP 3) DO- WHILE - LOOP 4) FOR- EACH- LOOP


        // 1) for- loop   for loop'ta genellikle "i" harfi kullanilir
        // baslangic degeri   Loop'un calisma sarti  Increment/ Decrement
        for (int i = 1        ; i < 6                 ; i++) {

            System.out.print("Hi!");
        }

        System.out.println();


        //Ex 2 : 11den 44e kadar tum tamsayilari ekrana yazdiran kodu yaziniz

        for(int i=11; i<45; i++){
            System.out.print(i);

        }

        System.out.println();

        // Ex 3 : 40dan 23e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz

        for(int i=40; i>22;i--){
            if(i%2==0){
                System.out.print(i);
            }
        }


        System.out.println();

        // Ex 4 : 18'den 56' ya kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz

        for(int i=18; i<57; i++){
           if(i%2!=0){
               System.out.print(i+ " ");
           }
        }


        System.out.println();

        // Ekrana 10 kere " Java guzeldir"

        for (int i = 1; i <11 ; i++) {
            System.out.println(i+":"+"Java guzeldir");

        }

}
    }

