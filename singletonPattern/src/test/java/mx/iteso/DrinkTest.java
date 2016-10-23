package mx.iteso;
import mx.iteso.singleton.Drink;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by lamos on 10/22/2016.
 */
public class DrinkTest {
    private Drink drink;

    @Before
    public void setup(){
        drink = new Drink();
        drink.setWaiter("Nestor");
        drink.setName("Heineken");
        drink.setPrice(60);
        drink.setDescription("Cerveza Alemana");
    }
    @Test
    public void testGetWaiter(){
        assertEquals("Nestor",drink.getWaiter());
    }

    @Test
    public void testGetName(){
        assertEquals("Heineken",drink.getName());
    }
    @Test
    public void testGetPrice(){
        assertEquals(60, drink.getPrice(),0);
    }

    @Test
    public void testGetDescription(){
        assertEquals("Cerveza Alemana",drink.getDescription());
    }
}
