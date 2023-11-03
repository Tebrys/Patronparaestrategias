import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MallardDuckTest {
    private Duck d;
    private ByteArrayOutputStream out;

    @Before
    public void before(){
    d = new MallardDuck();
    out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    }


    @Test
    public void testSwim() {
        d.swim();
        assertTrue(out.toString().toLowerCase().contains("estoy nadando"));
    }

    @Test
    public void testFly() {
        d.flyBehavior = new FlyWithWings();
        d.performFly();
        assertTrue(out.toString().toLowerCase().contains("estoy volando"));
    }
    @Test
    public void testmakeSound()  {
        d.soundBehavior = new Quack();
        d.performSound();
        assertTrue(out.toString().toLowerCase().contains("sonido quack ..."));
    }
    @Test
    public void testDisplay() {
        d.display();
        assertTrue(out.toString().toLowerCase().contains("soy un pato"));
    }
        @Test
    public void testToString(){
        String esperado = "mallarduck{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}
