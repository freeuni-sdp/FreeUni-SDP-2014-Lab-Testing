import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * @author Sandro Dolidze
 */
public class URLTest {

    @Test
    public void testParseReturnsNotNull() {
        URL url = URL.parse("http://facebook.com");
        assertTrue(url != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseThrowsExceptionWhenInputIsNull() {
        URL url = URL.parse(null);
    }

    @Test
    public void testProtocol() {
        URL url = URL.parse("http://apple.com");
        assertEquals("http", url.getProtocol());
    }

    @Test
    public void testDomainWhenPathIsEmpty() {
        URL url = URL.parse("http://google.com");
        assertEquals("google.com", url.getDomain());
    }

}