package mx.iteso;
import mx.iteso.singleton.ChocolateFactoryLazy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by lamos on 10/22/2016.
 */
public class ChocolateFactoryLazyTest {

        ChocolateFactoryLazy lazy;
        ChocolateFactoryLazy lazy1;

        @Before
        public void setUp(){
            lazy = ChocolateFactoryLazy.getInstance();
            lazy1 = ChocolateFactoryLazy.getInstance();
        }


        @Test
        public void FillTest(){
            lazy.fill();

            assertEquals(lazy.isBoiled(), lazy1.isBoiled());
            assertEquals(lazy.isEmpty(), lazy1.isEmpty());

        }


        @Test
        public  void BoilTest(){
            lazy1.boil();
            assertEquals(lazy.isBoiled(), lazy1.isBoiled());
            assertEquals(lazy.isEmpty(), lazy1.isEmpty());
        }

        @Test
        public void InstanceTest(){
            assertEquals(lazy, lazy1);
        }




    }

