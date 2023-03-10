import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FizzbuzzTest {

    @Test
    void whenGivenThreeThenReturnFizz(){
        //GIVEN
        int i = 3;
        //WHEN
        String result = Fizzbuzz.fizzbuzz(i);
        //THEN
        assertEquals("Fizz",result);
    }
    @Test
    void whenGivenFiveThenReturnBuzz(){
        //GIVEN
        int i = 5;
        //WHEN
        String result = Fizzbuzz.fizzbuzz(i);
        //THEN
        assertEquals("Buzz",result);
    }
@Test
    void whenGivenFiveteenThenReturFizzBuzz(){
        //GIVEN
    int i = 15;
    //WHEN
    String result = Fizzbuzz.fizzbuzz(i);
    //THEN
    assertEquals("Fizzbuzz",result);
}
@Test
    void whenGivenElevenThenReturnEleven(){
        //GIVEN
    int i = 11;
    //WHEN
    String result = Fizzbuzz.fizzbuzz(i);
    //THEN
    assertEquals(Integer.toString(i),result);
}
}
