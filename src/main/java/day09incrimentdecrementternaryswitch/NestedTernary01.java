package day09incrimentdecrementternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {

      /*
       Ex1:   Verilen yilin "Artik yil" (Leap year)(INTERVIEW)  olup olmadigini kontrol eden kodu yaziniz
              1) yil 100'E BOLUNUYORSA 400'E BOLUNMELIDIR.    1600==> LEAP  1800==> LEAP degil
              2) yil 100'e bolunmuyorsa 4'e bolunmelidr.       2004==> Leap   2005==> Leap degil

       */
       int year = 2023;

      String result= year%100==0 ?(year%400==0 ? "Leap" : "Not leap") : (year%4==0 ? "Leap " : "Not leap");
        System.out.println(result);
        //!!!!!!! nestedifler sertifika sinavlarinda cikar



    }
}
