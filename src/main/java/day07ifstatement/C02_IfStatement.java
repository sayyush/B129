package day07ifstatement;

import java.util.Scanner;

public class C02_IfStatement {
    // Kullanici gun numarasiini girsin kod gun ismini yazsin
   // 1 ==> pazar yazdirsin   2==> Pazartesi 5==> persembe   // YURT DISINDA 1. gun pazar gunden baslaniyor
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz ..");
        byte gunNo = input.nextByte();



      if(gunNo==1){
          System.out.println("Pazar");
      }else if(gunNo==2){
          System.out.println("Pazartesi");
      }else if(gunNo==3){
          System.out.println("Sali");
      }else if(gunNo==4){
          System.out.println("Carsamba");
      }else if(gunNo==5){
          System.out.println("Persembe");
      }else if(gunNo==6){
          System.out.println("Cuma");
      }else if(gunNo==7){
          System.out.println("Cumartesi");
      }else{
          System.out.println("Hatali giris yaptiniz. Lutfen 1 ile 7 arasinda bir sayi giriniz...");
      }





}}
