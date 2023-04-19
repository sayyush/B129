package teamwork;

import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {

     // Example 1: Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı bulunuz.
     // Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2

        int[] numbers = {-12, 18, -5, 23, -2};
        int minPositive = Integer.MAX_VALUE; //+2147483647
        int maxNegative = Integer.MIN_VALUE; //-2147483648

        for (int number : numbers) {
            if (number > 0 && number < minPositive) {
                minPositive = number; // 18 = minPositive // 18 = minPositive
            } else if (number < 0 && number > maxNegative) {
                maxNegative = number; // -12 = maxNegative  // -5 = maxNegative // -2 = maxnegative
            }
        }
        System.out.println("En küçük positive element is " + minPositive);
        System.out.println("En büyük negative element is " + maxNegative);
    }
}


