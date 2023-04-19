package teamwork;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {

        // FOR lOOP==>  [slayt] Soru 1) Ekrana 10 kez "Java guzeldir" yazdrin

        for(int i=1; i<11; i++){
            System.out.println(i+ ":"+ "Java guzeldir");

        }

        System.out.println();

       // Soru 2) 10 ile 30 arasindaki(10 ve 30 dahil)
        // sayilari aralarinda virgul olarak ayni satirda yazdirin

        for (int i = 10; i <31 ; i++) {
            System.out.print(i+",");
        }

        System.out.println();


        // Soru 3) 100'den baslayarak 50'ye(dahil) kadar olan sayilari aralarinda "," olarak ayni satirda yazdirin


        for (int i = 100; i>49; i--) {
            System.out.print(i+ ",");

        }

        System.out.println();
        // Soru 4) Kullanicidan 100'den kucuk bir tamsayi isteyin.
        // 1'den baslayarak girilen sayiya kadar 3'un kati olan sayilari yazdirin

        Scanner input= new Scanner(System.in);
        System.out.println("100'den kucuk bir tamsayi girin...");
        int num = input.nextInt();

        for (int i = 1; i <=num ; i++) {
            if(i%3==0){
                System.out.println(i);
            }
        }

        System.out.println();


        // Soru 5) Kullanicidan 100'den kucuk bir tamsayi isteyin.
        // 1'den baslayarak girilen sayiya kadar 3'un veya 5'in kati olan sayilari yazdirin

        System.out.println("100'den kucuk bir tamsayi girin");
        int num1 = input.nextInt();

        for (int i = 1; i <=num1; i++) {
            if(i%3==0 || i%5==0){
                System.out.println(i);
            }
        }


        System.out.println();

        // Ex 6 (for loop slaytdaki soru): INTERVIEW QUESTION  Kullanicidan 100den kucuk bir tamsayi isteyin.
        // 1'den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
        //       - Sayi 3'un kati ise sayi yerine "Java" yazdirin
        //       - Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin
        // Sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir" yazdirin.




        System.out.println("Bir sayi giriniz. ((1 ile 100 arasinda");

        int sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("Java Guzeldir,  ");

            } else if (i % 3 == 0) {
                System.out.print("Java, ");

            } else if (i % 5 == 0) {
                System.out.print("Guzeldir, ");


            } else {
                System.out.print(i+",");
            }
        }


    }
}
