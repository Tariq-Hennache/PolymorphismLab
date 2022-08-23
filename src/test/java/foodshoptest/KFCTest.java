package foodshoptest;

import foodshop.KFC;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KFCTest {

    private KFC kfc;

    @BeforeEach
    public void setUp(){
        kfc = new KFC("Box meal",8);
    }

    @Test
    public void canAddWings(){
        String expected = "How many wings do you want?";
        String actual = kfc.addWings();
        assertEquals(expected, actual);
    }

    @Test
    public void canGetPopularFood(){
        String expected = "Box meal";
        String actual = kfc.popularFood();
        assertEquals(expected, actual);
    }

    @Test
    public void canGetFamilyBucketSize(){
        kfc = new KFC("Snack box", 6);
        int expected = 6;
        int actual = kfc.getFamilyBucketSize();
        assertEquals(expected, actual);
    }

}
