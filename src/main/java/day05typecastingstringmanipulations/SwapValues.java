package day05typecastingstringmanipulations;

public class SwapValues {

    //SWAP: YER DEGISTIRMEK. 1.KAPTA PATATES VAR, 2.KAPTA DOMATES VAR===> 1.KAPTA DOMATES 2. KAPTA PATAES OLUCAK

    public static void main(String[] args) {

        int a = 12;
        int b = 5;       // swap'den sonra  a=5 b=12    INTERVIEW QUESTIONS  // temporary gecici demek
        int temp = 0;

        System.out.println("a:"+a);
        System.out.println("b:"+ b);

       // 1. YOL
       // 1. adim
        temp = a;

        // 2. adim
        a = b;

        // 3. adim
        b= temp;

        System.out.println("a:"+a);
        System.out.println("b:"+ b);


//2.YOL  INTERWIEV SORUSU BU YOLU ISTERLER


        int x = 12;
        int y = 5;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println(x);
        System.out.println(y);









    }

}
