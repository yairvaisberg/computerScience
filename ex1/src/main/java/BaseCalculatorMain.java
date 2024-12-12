import java.util.Scanner;

public class BaseCalculatorMain {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        BaseCaLculator base = new BaseCaLculator();  //create new object base from BaseCaLculator


        //enter the first number
        System.out.println("Enter a string as number#1");
        String num1 = in.nextLine();

        //enter second number
        System.out.println("Enter a string as number#2");
        String num2 = in.nextLine();

        //enter the base
        System.out.println("enter a base to get the answer in:");
        String Stringbase = in.nextLine();


        //run the function
        System.out.println(base.CalculateBiggestValue(num1, num2,Stringbase));




    }
}
