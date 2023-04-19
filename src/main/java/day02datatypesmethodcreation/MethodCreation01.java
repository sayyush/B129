package day02datatypesmethodcreation;

import java.util.Scanner;

public class MethodCreation01 {

    public static void main(String[] args) {


        int sonuc = add(30, 50);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(3, 5);
        System.out.println(carpmaSonucu);
        //  shift + alt + .  jakynlastyrady
        //  shift + alt + ,  alyslatady
        // ctrl  + alt + L sayfayi guzel gorunume getirir

        int ucluSonuc = firstTwoMultiplyThirdAdd(2, 5, 8);
        System.out.println("ucluSonuc = " + ucluSonuc);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    protected static long multiply(int a, int b) {
        return a * b;
    }

    //ornek 1: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c) {
        return a * b + c;
    }
}


