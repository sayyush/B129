package day28exceptions;

public class Exceptions06 {

    public static void main(String[] args) {

        String s = "Java";
        getNumberOfChars(s);

        String t = "";
        getNumberOfChars(t); // 0  cunku hiclikte birsey yokki ondan birsey isteyesin.



        String u = null;
        getNumberOfChars(u); // NullPointerException

    }

    // String'in degeri " null" oldugunda String Class'daki bazi  method'lari  kullanamayiz. Kullanirsaniz NullPointerException atar.
    public static void getNumberOfChars(String s){
try{
    int numOfChars = s.length();
    System.out.println(numOfChars);
}catch (NullPointerException e){
    System.out.println("Null degeri icin bazi method'lar kullanilamaz");
}

    }

}
