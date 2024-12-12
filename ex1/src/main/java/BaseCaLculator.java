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
    public  boolean checkIfNotEmpty(String input){

        if (input==null || input.isEmpty())
            return false;

        return true;

    }

    // a function that get a String and validates it according to Ex1 and returns a boolean value
    public  boolean validateInput(String input){


        if (!checkIfNotEmpty(input)){    //use function checkIfEmptyOrHasb to validate String
            return false;
        }



        if (!hasb(input)) {//if b is not in the string return true
            return true;
        }
        String[] splitResult = input.split("b");     //split the String in b to check both sides separately


        if (splitResult.length!=2){
            return false;
        }

        String number2Convert = splitResult[0];  //left side contains the number we need to convert to int
        String inputBase = splitResult[1];  //right side contains the string of the number of the base

        if (inputBase.length() != 1){   //check if base is not length 1 ,base must be length 1 we are cheking from base 2-G(2,3,4,5,6,7,8,9,A,B,C,D,E,F,G)
            return false;   //if base is not length 1 - return false
        }

        if (number2Convert.isEmpty())   //check if we have String we need to convert to numbers
            return false;   //if we don't - return false

        char asciiBase = inputBase.charAt(0); // using ascii to find if base is between 2-9 or A-G

        if( ((int)asciiBase>57 && (int)asciiBase<65) || (int)asciiBase<50 || (int)asciiBase>71) {   //if ascii of base is bigger than G or smaller than 2 or bigger than 9 but smaller than A
            return false;   //if it is then it's not a char that we are checking for base (examples - 'd','*','-','?','@') - return false
        }

        //base is a valid number

        int base=0; //making the int base to get the number of the base , base must be valid so the int will change

        if ((int)asciiBase>=65 && (int)asciiBase<=71){  //checking if base is from(A-G)
            base=(int)asciiBase-55;     //base - 55 = the base we need in numbers(int)
        }
        if ((int)asciiBase>=50&&(int)asciiBase<=57){    //checking if base is from(2-9)
            base = Integer.parseInt(inputBase);     //using parse int to convert a string of a number to int
        }

        for (int i = 0; i < number2Convert.length() ; i++) {    //looping through all chars in String of numbers
            if( ((int)number2Convert.charAt(i)<65&&(int)number2Convert.charAt(i)>57)||(int)number2Convert.charAt(i)<48||(int)number2Convert.charAt(i)>71){ // check if every char in the number is valid(0-G)
                return false; // if not - return false
            }
        }
        //number now must be valid

        for (int i = 0; i <number2Convert.length(); i++) {  //convert every digit in the number to int
            int digit=0;
            if ((int)number2Convert.charAt(i)>=65&&(int)number2Convert.charAt(i)<=71){ // if number is a letter(A-G)
                digit=(int)number2Convert.charAt(i)-55; // get number value(A=10,B=11...)
            }
            if ((int)number2Convert.charAt(i)>=48&&(int)number2Convert.charAt(i)<=57){  // if number is a number(0-9)
                digit=(int)number2Convert.charAt(i)-48; // get number value
            }
            if (digit>=base) {  //check if the current digit is bigger or equal to the base
                return false; // if it is return false   4 is not in base 4 or lower
            }
        }
        return true; // every thing is valid then String is validated

    }


}
