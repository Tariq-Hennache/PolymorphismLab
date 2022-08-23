package foodshoptest;

import foodshop.Subway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubwayTest {

    private Subway subway;

    @BeforeEach
    public void setUp(){
        subway = new Subway("Meatball mariana", "White bread");
    }

    @Test
    public void canGetPopularFood(){
        String expected = "BMT";
        String actual = subway.popularFood();
        assertEquals(expected, actual);
    }
}
