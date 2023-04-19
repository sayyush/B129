package day28exceptions;

public class Exceptions04 {

    public static void main(String[] args) {

        // ERROR ILE ISSUE ARASINDA FARK VAR.
        // Exception ne dediginde - unexpected issue demen lazim, unexpected error dersen olmaz,
        // cunku error'in teknik anlami var, ve error handle edilmeyen bir sey.

        String arr[] = {"A", "G", "M", "L"};

        getElementFromArray(arr,1); // G
        getElementFromArray(arr,5); // Index 5 out of bounds for length 4

    }

    // Array'lerde olmayan bir index kullanildiginda Java ArrayIndexOutOfBoundsException atar.
    public static void getElementFromArray(String[] s, int idx){

        try{
            String el = s[idx];
            System.out.println(el);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
}
