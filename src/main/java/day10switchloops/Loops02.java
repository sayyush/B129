package day10switchloops;

public class Loops02 {
    public static void main(String[] args) {

        // Ex 1 : 21 den 180' e kadar hem 4 e hem de 6 ile bolunebilen tamsayilari ekrana yazdiran kodu yaziniz
        // yan yana yazdirmak icin system.out.print'ti kullaniniz "ln" yazmayin

        for(int i = 21; i<181; i++){
           if(i%4==0 && i%6==0){
               System.out.print(i+ " ");
           }
        }


     // Ex 2: Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan characterler'i buyuk harf yaziniz
        //       ankara==> AnKaRa
        // Yazdiginiz code belli senaryolar icin calisiyor, tum senaryolar icin calismiyorsa bu koda HARDCODE denir
        // HARDCODE(sert kod) = yanlis yazilmis koddur mutlaka duzeltilmelidir

        // NOTE: Bir String'de son index esittir length'in()-1 bir eksigidir her zaman

        System.out.println();


        String s = "ankara";

        for(int i=0; i<s.length(); i++){

           String ch= s.substring(i, i+1);
          if(i%2==0){

              System.out.println(ch.toUpperCase());

          }

        }











    }
}
