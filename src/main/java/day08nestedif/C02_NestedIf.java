package day08nestedif;

public class  C02_NestedIf {
    /*
    Password'un ilk harfi buyuk harf ise
    'A' olursa gecerli password yazdirin,degilse gecersiz password yazdirin
    Password'un ilk harfi kucuk harf ise
    'z' olursa gecerli password yazdirin degilse gecersiz password yazdir

     */

    public static void main(String[] args) {

        String pwd ="zxy12!";
        char ilkHarf =pwd.charAt(0);

        if(ilkHarf>='A' && ilkHarf<='Z'){
            if(ilkHarf=='A'){//true
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz Password");
            }

        }else if(ilkHarf>='a'  && ilkHarf<= 'z'){

            if(ilkHarf=='z'){

                System.out.println("Gecerli Password");

            }else{
                System.out.println("Gecersiz Password");
            }

        }else{
            System.out.println("Ilk Karakter Harf Olmali");
        }

    }
}
