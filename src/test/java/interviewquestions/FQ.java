package interviewquestions;

public class FQ {
    public static void main(String[] args) {
        // 1) Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.

    int num=578; // 5+ 7 +8 = 20
    num= Math.abs(num);
    int sum=0;


        while(num>0){

        sum= sum+ num%10;

        num= num/10;
}
        System.out.println(sum);

        System.out.println();


        // 1) Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
        //  Örneğin; Hello ==> Heo

       String s= "Hello";
       int i=0;

       while(i<s.length()){

           String c= s.substring(i, i+1);


           if(s.indexOf(c)== s.lastIndexOf(c)){


               System.out.print(c);// Heo



           }

           i++;




       }

        //  indexOf(): girelen ilk harfin ilk indexini verir
        // lastIndexOf(): girelen harfin sondan baslayarak bastan kacıncı indexte oldugu verir





















































        // 3)
         /*
    Interwiew Questions
     Kullanicidan toplanmak uzere sayilar isteyin
     sayi adedi 10'u gecerse veya toplam 500 'u gecerse
     bu kadar sayi yeter
     ".... adet sayi girdiniz , toplami..." yazdirin
     */



    }
}
