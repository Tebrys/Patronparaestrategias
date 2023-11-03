import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlyNoWayTest{
private IFly ifly;
private ByteArrayOutputStream out;
public FlyNoWayTest(){}
    @Before
    public void before() throws Exception {
        ifly = new FlyNoWay();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testFly() {
    ifly.fly();
        assertTrue(out.toString().toLowerCase().contains("no puedo volar alv"));
    }
    @Test
    public void testTestToString() {
        String esperado = "flynoway{}";
        String obtenido = ifly.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}