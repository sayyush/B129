package day03scanner;

import java.util.Scanner;

public class C02_Scanner {

    // Scanner classi kullanici ile etkilesim kurmamizi saglar.
    //Scanner bir Classtir. Java util kutuphanesinden getirildigi icin import ister.

    public static void main(String[] args) {

        // Kullanicidan Data almak  icin

        // 1.Adim Scanner classindan obje olusuturun/

         Scanner input = new Scanner(System.in);
        // Scanner scan= new Scanner(System.in;      //yandaki ve yukardakini kullanabiliriz

        // 2. adim kullaniciya ne yapacagini soyle
        System.out.println(" Lutfen yasinizi giriniz");

        // 3. adim  kullanicidan aldiginiz datayi variable icine koyun

        byte age = input.nextByte();

        // kullaniciya ad memleket yas boy yasadigi yeri sevip sevmedigini soran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz....");
        String name = scan.nextLine(); // kullanicidan String bir deger istedik tum satiri almasi icin nextline sectik

        System.out.println("Lutfen memleketinizi giriniz...");
        String country = scan.nextLine();

        System.out.println(" Lutfen yasinizi giriniz...");
        int yas= scan.nextInt();

        System.out.println(" Lutfen boyunuzu giriniz....");
        short height = scan.nextShort();

        System.out.println(" Lutfen yasadiginiz yeri sevip sevmediginizi yaziniz....");
        boolean seviyorMu = scan.nextBoolean();

        System.out.println("**************");
        System.out.println("name="+ name);
        System.out.println("country="+ country);
        System.out.println("="+ yas);
        System.out.println("height="+ height);
        System.out.println("seviyorMu="+ seviyorMu);

    }

}
