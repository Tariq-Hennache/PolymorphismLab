package foodcourttest;

import foodcourt.FoodCourt;
import foodshop.FoodShop;
import foodshop.KFC;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodCourtTest {

    private FoodCourt foodCourt;

    @BeforeEach
    public void setUp(){
        foodCourt = new FoodCourt("Westfield Food");
    }

    @Test
    public void canGetName(){
        String expected = "Westfield Food";
        String actual = foodCourt.getName();
        assertEquals(expected,actual);
    }

    @Test
    public void canCountFoodShop(){
        int expected = 0;
        int actual = foodCourt.countShops();
        assertEquals(expected, actual);

    }

    @Test
    public void canAddFoodShop(){
        FoodShop foodShop = new FoodShop("Burger King");
        foodCourt.addShop(foodShop);
        int expected = 1;
        int actual = foodCourt.countShops();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddMultipleFoodShop(){
        FoodShop foodShop = new FoodShop("McDonald's");
        FoodShop foodshop = new FoodShop("Pizza Hut");
        foodCourt.addShop(foodShop);
        foodCourt.addShop(foodShop);
        int expected = 2;
        int actual = foodCourt.countShops();
        assertEquals(expected, actual);
    }
}
