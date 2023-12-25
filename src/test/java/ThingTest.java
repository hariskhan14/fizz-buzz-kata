import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ThingTest {

    @Test
    public void it_should_call_for_action() {
        Thing thing = new Thing();
        String value = thing.callForAction();
        assertEquals("Dog", value);
    }

    @Test
    public void it_should_not_fail() {
        assertTrue(true);
    }
}
