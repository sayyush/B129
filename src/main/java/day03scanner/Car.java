package day03scanner;

public class Car {

    // Class==>Variable (pasif ozellikler)==> Object
    //Method( Aktif ozellikler)


     public String model= "Corolla";
     public int fiyat = 200000;


    public static void main(String[] args) {

        //Class ismini yazin # objeye isim veririz = new keywordunu kullan Class ismini () ile kullan constructor asci yani mutait
        Car           myCorolla                    = new                       Car();

        System.out.println(myCorolla.fiyat);
        System.out.println(myCorolla.model);
        myCorolla.hareket();
        myCorolla.dur();


    }// main'nin body'si

    public void hareket(){
        System.out.println("Toyota hizli hareket eder...");

    }
    public void dur(){
        System.out.println("Toyota guvenle durur...");


    }
}// class body'si
