package foodshoptest;

import foodshop.TacoBell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TacoBellTest {

    private TacoBell tacoBell;

    @BeforeEach
    public void setUp(){tacoBell = new TacoBell("Spicy Chicken", "Gluten free");}

    @Test
    public void canGetTacoType(){
        String expected = "Gluten free";
        String actual = tacoBell.getTacoType();
        assertEquals(expected, actual);
    }

    @Test
    public void canGetPopularFood(){
      String expected = "Spicy BBQ Taco";
      String actual = tacoBell.popularFood();
      assertEquals(expected, actual);
    }

    @Test
    public void canAddTortilla(){
        String expected = "How many Tortillas you want?";
        String actual = tacoBell.addTortillas();
        assertEquals(expected, actual);

    }

}
