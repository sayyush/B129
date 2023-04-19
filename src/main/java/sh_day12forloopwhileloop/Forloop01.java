package sh_day12forloopwhileloop;

import java.util.Scanner;

public class Forloop01 {
    public static void main(String[] args) {

/*
      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
            X X X X X
            X X X X X
            X X X X X
            NESTEDLOOP
*/

        Scanner input= new Scanner(System.in);
        System.out.println("Satir(row) sayisini giriniz");
        int row= input.nextInt();

        System.out.println("sutun(column) sayisini giriniz");
        int column = input.nextInt();

        for(int i=1; i<=row; i++){

            for(int k=1; k<=column; k++){

                System.out.print("X ");// x'in yaninda bosluk var
            }
            System.out.println(); // bos sout sizi alt satira alir
        // INTERVIEW'DE soruyu nasil cozdugunu cizmeni isteyebilir
        }

    }
}
