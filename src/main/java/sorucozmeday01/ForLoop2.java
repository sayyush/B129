package sorucozmeday01;

public class ForLoop2 {
    public static void main(String[] args) {

        // Ex 1 : 21 den 180' e kadar hem 4 e hem de 6 ile bolunebilen tamsayilari ekrana yazdiran kodu yaziniz
        // yan yana yazdirmak icin system.out.print'ti


        for(int i=21; i<181; i++){

            if(i%4==0 && i%6==0) {

                System.out.println(i + " ");

            }
        }
// Ex 2: Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan characterler'i buyuk harf yaziniz
        //       ankara==> AnKaRa

        String s ="ankara";

        for(int i=0; i<s.length();i++){


            String ch= s.substring(i, i+1);
            if(i%2==0){
                System.out.println(ch.toUpperCase());
            }

        }










    }
}
