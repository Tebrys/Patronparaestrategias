import org.junit.Test;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyWithWingsTest {
    private IFly ifly;
    private ByteArrayOutputStream out;
    public FlyWithWingsTest(){}

    @Before
    public void before()  {
        ifly = new FlyWithWings();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @Test
    public void testFly() {
        ifly.fly();
        assertTrue(out.toString().toLowerCase().contains("estoy volando..."));
    }
@Test
    public void testToString() {
    String esperado = "flywithwings{}";
    String obtenido = ifly.toString().toLowerCase();
    assertEquals(esperado, obtenido);
    }
}