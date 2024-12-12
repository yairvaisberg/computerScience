
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BaseCaLculatortest {

    BaseCaLculator base = new BaseCaLculator();  //create new object base from BaseCaLculator


    @Test
    // test if ClalculateBiggestValue gives correct answers
    void CalculateBiggestValue(){
        String ex1test1 = base.CalculateBiggestValue("1010b2","5","A");
        assertEquals(ex1test1,"50bA");

        String ex1test2 = base.CalculateBiggestValue("01b2","01b2","2");
        assertEquals(ex1test2,"10b2");

        String ex1test3 = base.CalculateBiggestValue("AbG","15b7","3");
        assertEquals(ex1test3,"11110b3");

        String ex1test4 = base.CalculateBiggestValue("1","1","7");
        assertEquals(ex1test4,"2b7");

    }



    @Test
    void convertFromBase10Test(){
    // test if convertFromBase10Test gives correct answers
        String coverted1 = base.convertFromBase10(151,9);
        assertEquals(coverted1,"177");
        String coverted2 = base.convertFromBase10(45546,8);
        assertEquals(coverted2,"130752");
        String coverted3 = base.convertFromBase10(48,15);
        assertEquals(coverted3,"33");
        String coverted5 = base.convertFromBase10(48,6);
        assertEquals(coverted5,"120");
        String coverted6 = base.convertFromBase10(32,5);
        assertEquals(coverted6,"112");
    }



    @Test
    void convertToBase10Test(){
        // test if convertToBase10Test gives correct answers


        String[] NumToConvert = {"322","3434b6","BbG","10110b2","45b7"};

        int converted1 = base.convertToBase10(NumToConvert[0]);
        assertEquals(converted1,322);
        int converted2 = base.convertToBase10(NumToConvert[1]);
        assertEquals(converted2,814);
        int converted3 = base.convertToBase10(NumToConvert[2]);
        assertEquals(converted3,11);
        int converted4 = base.convertToBase10(NumToConvert[3]);
        assertEquals(converted4,22);
        int converted5 = base.convertToBase10(NumToConvert[4]);
        assertEquals(converted5,33);

    }


    @Test
    void checkIfNotEmptyTest(){
        // test if checkIfNotEmptyTest gives correct answers


        String[] isEmpty = {null,""};

        for (int i = 0; i < isEmpty.length; i++) {

            boolean isFalse = base.checkIfNotEmpty(isEmpty[i]);
            assertFalse(isFalse);
        }

        String[] isNotEmpty = {"322","3434b6","BbG","4AbD","0"};

        for (int i = 0; i < isNotEmpty.length; i++) {
            boolean isTrue = base.checkIfNotEmpty(isNotEmpty[i]);
            assertTrue(isTrue);
        }
    }


    @Test
    void hasbTest(){
        // test if hasbTest gives correct answers


        String[] hasbTrue = {"135bA","100111b2","12345b6","012b5","123bG","EFbG"};

        for (int i = 0; i < hasbTrue.length; i++) {
            boolean isTrue = base.hasb(hasbTrue[i]);
            assertTrue(isTrue);
        }

        String[] hasbfalse = {"135","100111","12345","012","123","EF"};

        for (int i = 0; i < hasbfalse.length; i++) {
            boolean isFalse = base.hasb(hasbfalse[i]);
            assertFalse(isFalse);
        }
    }



    @Test
    void additionTest(){
        // test if additionTest gives correct answers


        int addEqual1 = base.addition(2,1);
        assertEquals(addEqual1,3);
        int addEqual2 = base.addition(4,3);
        assertEquals(addEqual2,7);
        int addEqual3 = base.addition(3,8);
        assertEquals(addEqual3,11);

        int addNotEqual1 = base.addition(1,6);
        assertNotEquals(addNotEqual1,5);
        int addNotEqual2 = base.addition(8,7);
        assertNotEquals(addNotEqual2,10);
        int addNotEqual3 = base.addition(4,0);
        assertNotEquals(addNotEqual3,2);
        int addNotEqual4 = base.addition(3,44);
        assertNotEquals(addNotEqual4,99);

    }


    @Test
    void validateInputTest(){
        // test if validateInputTest gives correct answers


        String[] Valid = {"135bA","100111b2","12345b6","012b5","123bG","EFbG"};
        for (int i = 0; i < Valid.length; i++) {
            boolean isTrue = base.validateInput(Valid[i]);
            assertTrue(isTrue);
        }

        String[] Invalid = {"b2", "0b1", "123b", "1234b11", "3b3", "-3b5", "3 b4", "GbG", "", null};

        for (int i = 0; i < Invalid.length; i++) {
            boolean isFalse = base.validateInput(Invalid[i]);
            assertFalse(isFalse);
        }
    }
}