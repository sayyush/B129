package day11forloop;

public class ForLoop03 {
    public static void main(String[] args) {
     // Ex 1: Size verilen bir String'i tersten yazdiriniz.  Util==use(kullanmak demek)
           // "Germany" ==> ynamreG


        // **** INTERVIEW SORU ********
        String s = "Java";
        String t="";
        for(int i=s.length()-1; i>=0;i--){
           t = t +s.charAt(i);

        } System.out.println(t);
     // System.out.println(t);' bunu loop'in icine yazdirirsaniz her seyin adim adimini yazdirir INTERVIEW SORU

        // eX 2 : Size verilen bir String'in "Palindrome" olup olmadigini kontrol eden kodu yaziniz.
        //        civic, nalan, kucuk, 11211==> Palindrome

        // Logic: String'i ters cevir sonra da duz hali ile ters halini karsilastir, ayni ise "Palindrome" de.
        String duz = "civic";    // Stringler her zaman B ve K harflere duyarli
                                // equalIgnoreCase olsa b ve k harfe duyarsizdir
        String ters ="";

        for(int i=duz.length()-1; i>=0;i--){
            ters = ters + duz.charAt(i);
        }
        if(duz.equals(ters)){
            System.out.println(duz + " : Palindrome'dur");
        }else{
            System.out.println(duz + ": Palindrome degildir");
        }



















    }
}
