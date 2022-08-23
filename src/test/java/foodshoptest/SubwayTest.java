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

    @Test
    public void canAddCrisps(){
        String expected = "Do you want crisps";
        String actual = subway.addCrisps();
        assertEquals(expected, actual);
    }

    @Test
    public void canGetBreadType(){
        subway = new Subway("Turkey slices", "Italian Herb");
        String expected = "Italian Herb";
        String actual = subway.getBreadType();
        assertEquals(expected, actual);
    }
}
