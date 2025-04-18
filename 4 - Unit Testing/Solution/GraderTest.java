import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GraderTest {
    // 3 credit boundaries
    @Test
    public void testForGradeAFor3Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("255", "3").equals("A"));
    }

    @Test
    public void testForGradeBFor3Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("215" , "3").equals("B"));
    }

    @Test
    public void testForGradeCFor3Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("185", "3").equals("C"));
    }

    @Test
    public void testForGradeFFor3Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("100", "3").equals("F"));
    }

    @Test
    public void upperBoundaryTestFor3Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("300", "3").equals("A"));
    }

    @Test
    public void lowerBoundaryTestFor3Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("0", "3").equals("F"));
    }

    @Test
    public void lowerBoundaryTestForGradeAFor3Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("240", "3").equals("A"));
    }

    @Test
    public void lowerBoundaryTestForGradeBFor3Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("210", "3").equals("B"));
    }

    @Test
    public void lowerBoundaryTestForGradeCFor3Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("180", "3").equals("C"));
    }

    @Test
    public void upperBoundaryTestForGradeBFor3Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("239", "3").equals("B"));
    }

    @Test
    public void upperBoundaryTestForGradeCFor3Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("209", "3").equals("C"));
    }

    @Test
    public void upperBoundaryTestForGradeFFor3Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("179", "3").equals("F"));
    }

    @Test
    public void fractionOnBoundaryTestForGradeAFor3Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("239.01", "3").equals("A"));
    }

    @Test
    public void fractionOnBoundaryTestForGradeBFor3Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("209.01", "3").equals("B"));
    }

    @Test
    public void fractionOnBoundaryTestForGradeCFor3Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("179.01", "3").equals("C"));
    }

    @Test
    public void outOfUpperBoundaryTestFor3Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("300.01", "3").equals("Invalid number that exceed upper bound"));
    }

    @Test
    public void outOfLowerBoundaryTestFor3Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("-0.99", "3").equals("Invalid number that exceed lower bound"));
    }

    // 4 credit boundaries

    @Test
    public void testForGradeAFor4Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("325", "4").equals("A"));
    }

    @Test
    public void testForGradeBFor4Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("295" , "4").equals("B"));
    }

    @Test
    public void testForGradeCFor4Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("260", "4").equals("C"));
    }

    @Test
    public void testForGradeFFor4Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("100", "4").equals("F"));
    }

    @Test
    public void upperBoundaryTestFor4Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("400", "4").equals("A"));
    }

    @Test
    public void lowerBoundaryTestFor4Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("0", "4").equals("F"));
    }

    @Test
    public void lowerBoundaryTestForGradeAFor4Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("320", "4").equals("A"));
    }

    @Test
    public void lowerBoundaryTestForGradeBFor4Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("280", "4").equals("B"));
    }

    @Test
    public void lowerBoundaryTestForGradeCFor4Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("240", "4").equals("C"));
    }

    @Test
    public void upperBoundaryTestForGradeBFor4Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("319", "4").equals("B"));
    }

    @Test
    public void upperBoundaryTestForGradeCFor4Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("279", "4").equals("C"));
    }

    @Test
    public void upperBoundaryTestForGradeFFor4Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("239", "4").equals("F"));
    }

    @Test
    public void fractionOnBoundaryTestForGradeAFor4Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("319.01", "4").equals("A"));
    }

    @Test
    public void fractionOnBoundaryTestForGradeBFor4Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("279.01", "4").equals("B"));
    }

    @Test
    public void fractionOnBoundaryTestForGradeCFor4Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("239.01", "4").equals("C"));
    }

    @Test
    public void outOfUpperBoundaryTestFor4Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("400.01", "4").equals("Invalid number that exceed upper bound"));
    }

    @Test
    public void outOfLowerBoundaryTestFor4Credit(){
        Grader grader = new Grader();
        assertTrue(grader.grade("-0.99", "4").equals("Invalid number that exceed lower bound"));
    }

    //non number tests

    @Test
    public void nonNumberTest1(){
        Grader grader = new Grader();
        assertTrue(grader.grade("abc", "4").equals("Non-number input"));
    }

    @Test
    public void nonNumberTest2(){
        Grader grader = new Grader();
        assertTrue(grader.grade("123abc", "4").equals("Non-number input"));
    }

    @Test
    public void nonNumberTest3(){
        Grader grader = new Grader();
        assertTrue(grader.grade("--60", "3").equals("Non-number input"));
    }

    @Test
    public void nonNumberTest4(){
        Grader grader = new Grader();
        assertTrue(grader.grade("60@51782)9", "3").equals("Non-number input"));
    }

    @Test
    public void nonNumberTest5(){
        Grader grader = new Grader();
        assertTrue(grader.grade("240", "abcd").equals("Non-number input"));
    }

    @Test
    public void nonNumberTest6(){
        Grader grader = new Grader();
        assertTrue(grader.grade("abcd", "abcd").equals("Non-number input"));
    }

    //test for credit boundary

    @Test
    public void boundaryCreditTest1(){
        Grader grader = new Grader();
        assertTrue(grader.grade("260", "5").equals("Credit must be 3 or 4"));
    }

    @Test
    public void boundaryCreditTest2(){
        Grader grader = new Grader();
        assertTrue(grader.grade("260", "2").equals("Credit must be 3 or 4"));
    }

    @Test
    public void boundaryCreditTest3(){
        Grader grader = new Grader();
        assertTrue(grader.grade("260", "4.01").equals("Credit must be 3 or 4"));
    }

    @Test
    public void boundaryCreditTest4(){
        Grader grader = new Grader();
        assertTrue(grader.grade("260", "2.99").equals("Credit must be 3 or 4"));
    }

    @Test
    public void boundaryCreditTest5(){
        Grader grader = new Grader();
        assertTrue(grader.grade("260", "3.00").equals("A"));
    }

    @Test
    public void boundaryCreditTest6(){
        Grader grader = new Grader();
        assertTrue(grader.grade("260", "4.00").equals("C"));
    }

    //random

    @Test
    public void randomTest1(){
        Grader grader = new Grader();
        assertTrue(grader.grade("290.75", "3").equals("A"));
    }

    @Test
    public void randomTest2(){
        Grader grader = new Grader();
        assertTrue(grader.grade("290.75", "4").equals("B"));
    }

    @Test
    public void randomTest3(){
        Grader grader = new Grader();
        assertTrue(grader.grade("400", "3").equals("Invalid number that exceed upper bound"));
    }

    @Test
    public void randomTest4(){
        Grader grader = new Grader();
        assertTrue(grader.grade("-18", "4").equals("Invalid number that exceed lower bound"));
    }
}