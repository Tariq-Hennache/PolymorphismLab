package foodshoptest;

import foodshop.KFC;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KFCTest {

    private KFC kfc;

    @BeforeEach
    public void setUp(){
        kfc = new KFC("Box meal", false , 8);
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
        kfc = new KFC("Snack box", false , 6);
        int expected = 6;
        int actual = kfc.getFamilyBucketSize();
        assertEquals(expected, actual);
    }

    @Test
    public void canBeHealthy(){
        kfc = new KFC("snack box", true, 10);
        Boolean expected = true;
        Boolean actual = kfc.isItHealthy();
        assertEquals(expected, actual);
    }

}
