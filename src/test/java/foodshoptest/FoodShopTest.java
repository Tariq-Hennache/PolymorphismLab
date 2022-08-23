package foodshoptest;

import foodshop.FoodShop;
import foodshop.KFC;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodShopTest {

    private FoodShop foodShop;

    @BeforeEach
    public void setUp(){
        foodShop = new FoodShop("KFC");
    }

    @Test
    public void canGetKidsMenu(){
        Boolean expected = true;
        Boolean actual =  foodShop.isKidsMenu();
        assertEquals(expected, actual);
    }

    @Test
    public void canBeHealthy(){
        Boolean expected = false;
        Boolean actual = foodShop.isHealthy();
        assertEquals(expected, actual);
    }

    @Test
    public void canGetName(){
        String expected = "KFC";
        String actual = foodShop.getName();
        assertEquals(expected, actual);
    }

}

