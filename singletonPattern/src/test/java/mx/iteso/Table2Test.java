package mx.iteso;

import junit.framework.Assert;
import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import mx.iteso.singleton.tables.Table2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lamos on 10/22/2016.
 */
public class Table2Test {
    private Table2 table;
    private Drink drink, drink1;
    private Dish dish, dish1;


    @Before
    public void SetUp() {
        table = (Table2) table.getInstance();
        table.tableName = "table2";
        drink = new Drink();
        drink1 = new Drink();
        dish = new Dish();
        dish1 = new Dish();


    }

    @Test
    public void NuevoDishTest() {
        dish.setWaiter("Juan");
        dish.setName("hamburguesa");
        dish.setPrice(100);
        dish1.setWaiter(("Pedro"));
        dish1.setName("asada");
        dish1.setPrice(30);
        table.addDish(dish);
        table.addDish(dish1);
        Assert.assertEquals("Check for table2\nDrinks:\nDishes:\nJuan: hamburguesa 100.0\n" + "Pedro: asada 30.0\nTotal: $130.0", table.printCheck());
    }

    @Test
    public void NuevoDrinkTest() {
        drink.setWaiter("Juan");
        drink.setName("Tequila");
        drink.setPrice(70);
        drink1.setWaiter(("Pedro"));
        drink1.setName("Cerveza");
        drink1.setPrice(30);
        table.addDrink(drink);
        table.addDrink(drink1);
        Assert.assertEquals("Check for table2\nDrinks:\nJuan: Tequila 70.0\n" + "Pedro: Cerveza 30.0" + "\nDishes:\nTotal: $100.0", table.printCheck());
    }

    @After
    public void clearOrder() {
        table.clearOrder();
        table.clearDishes();
        table.clearDrinks();
    }
}
