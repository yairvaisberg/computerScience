
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Ex1Test {

    BaseCaLculator base = new BaseCaLculator();  //create new object base from BaseCaLculator


    @Test
    void ClalculateBiggestValue(){
        String ex1test1 = base.ClalculateBiggestValue("1010b2","5","A");
        assertEquals(ex1test1,"50bA");

        String ex1test2 = base.ClalculateBiggestValue("01b2","01b2","2");
        assertEquals(ex1test2,"10b2");

        String ex1test3 = base.ClalculateBiggestValue("AbG","15b7","3");
        assertEquals(ex1test3,"11110b3");

        String ex1test4 = base.ClalculateBiggestValue("1","1","7");
        assertEquals(ex1test4,"2b7");

    }



    @Test
    void convertFromBase10Test(){

        String coverted1 = Ex1.convertFromBase10(151,9);
        assertEquals(coverted1,"177");
        String coverted2 = Ex1.convertFromBase10(45546,8);
        assertEquals(coverted2,"130752");
        String coverted3 = Ex1.convertFromBase10(48,15);
        assertEquals(coverted3,"33");
        String coverted5 = Ex1.convertFromBase10(48,6);
        assertEquals(coverted5,"120");
        String coverted6 = Ex1.convertFromBase10(32,5);
        assertEquals(coverted6,"112");
    }



    @Test
    void convertToBase10Test(){

        String[] NumToConvert = {"322","3434b6","BbG","10110b2","45b7"};

        int converted1 = Ex1.convertToBase10(NumToConvert[0]);
        assertEquals(converted1,322);
        int converted2 = Ex1.convertToBase10(NumToConvert[1]);
        assertEquals(converted2,814);
        int converted3 = Ex1.convertToBase10(NumToConvert[2]);
        assertEquals(converted3,11);
        int converted4 = Ex1.convertToBase10(NumToConvert[3]);
        assertEquals(converted4,22);
        int converted5 = Ex1.convertToBase10(NumToConvert[4]);
        assertEquals(converted5,33);

    }


    @Test
    void checkIfNotEmptyTest(){

        String[] isEmpty = {null,""};

        for (int i = 0; i < isEmpty.length; i++) {

            boolean isFalse = Ex1.checkIfNotEmpty(isEmpty[i]);
            assertFalse(isFalse);
        }

        String[] isNotEmpty = {"322","3434b6","BbG","4AbD","0"};

        for (int i = 0; i < isNotEmpty.length; i++) {
            boolean isTrue = Ex1.checkIfNotEmpty(isNotEmpty[i]);
            assertTrue(isTrue);
        }
    }


    @Test
    void hasbTest(){

        String[] hasbTrue = {"135bA","100111b2","12345b6","012b5","123bG","EFbG"};

        for (int i = 0; i < hasbTrue.length; i++) {
            boolean isTrue = Ex1.hasb(hasbTrue[i]);
            assertTrue(isTrue);
        }

        String[] hasbfalse = {"135","100111","12345","012","123","EF"};

        for (int i = 0; i < hasbfalse.length; i++) {
            boolean isFalse = Ex1.hasb(hasbfalse[i]);
            assertFalse(isFalse);
        }
    }



    @Test
    void additionTest(){

        int addEqual1 = Ex1.addition(2,1);
        assertEquals(addEqual1,3);
        int addEqual2 = Ex1.addition(4,3);
        assertEquals(addEqual2,7);
        int addEqual3 = Ex1.addition(3,8);
        assertEquals(addEqual3,11);

        int addNotEqual1 = Ex1.addition(1,6);
        assertNotEquals(addNotEqual1,5);
        int addNotEqual2 = Ex1.addition(8,7);
        assertNotEquals(addNotEqual2,10);
        int addNotEqual3 = Ex1.addition(4,0);
        assertNotEquals(addNotEqual3,2);
        int addNotEqual4 = Ex1.addition(3,44);
        assertNotEquals(addNotEqual4,99);

    }


    @Test
    void validateInputTest(){

        String[] Valid = {"135bA","100111b2","12345b6","012b5","123bG","EFbG"};
        for (int i = 0; i < Valid.length; i++) {
            boolean isTrue = Ex1.validateInput(Valid[i]);
            assertTrue(isTrue);
        }

        String[] Invalid = {"b2", "0b1", "123b", "1234b11", "3b3", "-3b5", "3 b4", "GbG", "", null};

        for (int i = 0; i < Invalid.length; i++) {
            boolean isFalse = Ex1.validateInput(Invalid[i]);
            assertFalse(isFalse);
        }
    }
}