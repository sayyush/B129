package day16multidimensionalarrays;

public class Md06 {
    public static void main(String[] args) {

        // Bir multi dimensional array'deki en buyuk ve en kucuk sayinin toplamini kodu yaziniz

        int a[][] = { {21, 5},{ 14, 70, 11} };

        int small = a[0][0];  // ==> 21
        int big = a[0][0];

        for(int[] w: a){   // nested loop
            for(int k : w){
           small= Math.min(small, k);
           big= Math.max(big, k);
            }
        }
        System.out.println(small + big);

    }
}
