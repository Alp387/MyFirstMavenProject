import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SumSquareOrSubstractTest {


    @Test
    void firstValueLarger(){
        //GIVE
        int a= 10;
        int b= 5;
        //WHEN
        int result = Methoden.sumSquareOrSubstract(a,b);
        //THEN
    assertEquals(15,result);

    }

    @Test
    void firstValueNotLarger(){
        //GIVE
        int a= 10;
        int b= 15;
        //WHEN
        int result = Methoden.sumSquareOrSubstract(a,b);
        //THEN
        assertEquals(150,result);

    }
    @Test
    void boolIsTrueThenSubstract(){
        //GIVE
        int a = 5;
        int b = 10;
        boolean c = true;
        //WHEN
        int result = Methoden.sumSquareOrSubstract(a,b,c);
        //THEN
        assertEquals(-5,result);

    }
    @Test
    void boolIsFalseThenSubstract(){
        //GIVE
        int a = 5;
        int b = 10;
        boolean c = false;
        //WHEN
        int result = Methoden.sumSquareOrSubstract(a,b,c);
        //THEN
        assertEquals(50,result);

    }


//    @Test
//    void secondValueLargerMakeSquare(){
//        //GIVE
//        int a= 5;
//        int b= 10;
//        //WHEN
//        int result = Methoden.sumSquareOrSubstract(a,b);
//        //THEN
//    }
}
