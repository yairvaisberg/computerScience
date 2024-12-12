import java.util.Scanner;

public class BaseCaLculator {

    public String calculate(String val1, String val2, String val3){
        return "1";
    }



    //check if the input has b to indicate base that's not 10 if it has return true
    public  boolean hasb(String input){
        boolean isbExist=false; //create boolean to check if b exists in String

        for (int i = 0; i < input.length(); i++) {    //loop on all char in string looking for char 'b'
            if (input.charAt(i)=='b'){
                isbExist=true;  //b exists
                break;  //stop looking for 'b'
            }
        }
        if (!isbExist){     //if 'b' is not in string
            return false;
        }
        return true; //it's not empty or null and if it contains the char 'b' in the string then return true
    }

    // this function adds int a and int b
    public static int addition(int a,int b){
        return a+b;
    }

    // the function gets a string and returns true if it's not empty or null and if it contains the char 'b' in the string
    public static boolean checkIfNotEmpty(String input){

        if (input==null || input.isEmpty())
            return false;

        return true;

    }


}
