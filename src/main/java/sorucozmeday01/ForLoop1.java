package sorucozmeday01;

public class ForLoop1 {
    public static void main(String[] args) {

        //*** DERSTEKI SORU TEKRARI
        //Ex 1 : Ekrana 5 kere "Hi" yazdiriniz.

        // 1.YOL tavsiye edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        // 2. YOL :
        // Ayni adimlar tekrar tekrar yapilmasi gerektiginde " LOOP" kullanilir

        for (int i = 1; i < 6; i++) {

            System.out.println("Hi!");
        }
        //Ex 2 : 11den 14e kadar tum tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 11; i < 15; i++) {
            System.out.print(i);
        }

        System.out.println();

        // Ex 3 : 40dan 23e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 40; i > 22; i--) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }

        System.out.println();
        // Ex 4 : 18'den 56' ya kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz.

        for (int i = 18; i <57 ; i++) {
            if(i%2!=0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();

        // Ex 5: Ekrana 10 kere " Java guzeldir"
         for(int i=1; i<11; i++){
             System.out.println(i + ":"+ "Java guzeldir");

         }
























    }
}
