import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * @author Sandro Dolidze
 */
public class URLTest {

    @Test
    public void testParseReturnsNotNull() {
        URL url = URL.parse("sandro");
        assertTrue(url != null);
    }
}