import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class RubberDuckTest{
    private Duck d;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
    d = new RubberDuck();
    out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    }

    @Test
    public void testSwim() {
    d.swim();
    assertTrue(out.toString().toLowerCase().contains("estoy nadando"));
    }
    @Test
    public void testPerformFly() {
    d.flyBehavior = new FlyNoWay();
    d.performFly();
    assertTrue(out.toString().toLowerCase().contains("no puedo volar alv"));
    }
    @Test
    public void testPerformSound() {
    d.soundBehavior = new Squeak();
    d.performSound();
    assertTrue(out.toString().toLowerCase().contains("sonido squeak"));
    }

    @Test
    public void testTestToString() {
    String esperado = "rubberduck{}";
    String obtenido = d.toString().toLowerCase();
    assertEquals(esperado, obtenido);
    }
    @Test
    public void testDisplay() {
    d.display();
    assertTrue(out.toString().toLowerCase().contains("soy un pato de goma"));
    }
}