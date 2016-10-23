package mx.iteso;
import mx.iteso.singleton.Dish;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by lamos on 10/22/2016.
 */
public class DishTest {
    private Dish dish;

    @Before
    public void setup(){
        dish = new Dish();
        dish.setWaiter("Alex");
        dish.setName("Pasta");
        dish.setPrice(150);
        dish.setDescription("Pasta con carne");
    }

    @Test
    public void testGetWaiter(){
        assertEquals("Alex",dish.getWaiter());
    }

    @Test
    public void testGetName(){
        assertEquals("Pasta",dish.getName());
    }
    @Test
    public void testGetPrice(){
        assertEquals(150,dish.getPrice(),0);
    }

    @Test
    public void testGetDescription(){
        assertEquals("Pasta con carne",dish.getDescription());
    }
}

