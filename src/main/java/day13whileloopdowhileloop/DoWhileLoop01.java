package day13whileloopdowhileloop;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //1) while- loop
        int i= 1;

        while(i<1){
            System.out.println("Sen bir while loopsun...");
            i++;
        } // while body calismadi zero exocution
          // while loop'da zero exocution mumkundur
         // once dusunur sonra hareket eder

        // 2) do- while - loop

        int k = 1;
        do{
            System.out.println("Sen bir do while loop'sun");
            k++;
        }while(k<1);
        // do while body calisti
        // do while kullandiginizda loop body en az 1 kere calisir
        // do while'da zero exocution mumkun degildir
        // once hareket eder sonra bakar
        // oyunlarda kullanilir
    }
}
