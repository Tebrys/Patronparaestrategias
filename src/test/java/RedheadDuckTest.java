import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class RedheadDuckTest {
    private Duck d;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        d = new RedheadDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testSwim() {
    d.swim();
    assertTrue(out.toString().toLowerCase().contains("estoy nadando") );
    }

    @Test
    public void testPerformFly() {
    d.flyBehavior = new FlyWithWings();
    d.performFly();
    assertTrue(out.toString().toLowerCase().contains("estoy volando"));
    }

    @Test
    public void testPerformSound() {
    d.soundBehavior = new Quack();
    d.performSound();
    assertTrue(out.toString().toLowerCase().contains("sonido quack ...") );
    }

    @Test
    public void testTestToString() {
    String esperado = "redheadduck{}";
    String obtenido = d.toString().toLowerCase();
    assertEquals(esperado, obtenido);
    }

    @Test
    public void testDisplay() {
        d.display();
        assertTrue(out.toString().toLowerCase().contains("soy un pato"));
    }
}