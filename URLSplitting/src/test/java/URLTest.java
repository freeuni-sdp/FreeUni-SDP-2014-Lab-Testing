import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * @author Sandro Dolidze
 */
public class URLTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParseThrowsExceptionWhenInputIsNull() {
        URL url = URL.parse(null);
    }

    @Test
    public void testURLWhenPathIsEmpty() {
        URL url = URL.parse("http://google.com");
        assertEquals("http", url.getProtocol());
        assertEquals("google.com", url.getDomain());
        assertEquals("", url.getPath());
    }

    @Test
    public void testURLWhenPathIsNotEmpty() {
        URL url = URL.parse("ftp://google.com/search");
        assertEquals("ftp", url.getProtocol());
        assertEquals("google.com", url.getDomain());
        assertEquals("search", url.getPath());
    }

    @Test
    public void testURLWithTrailingSlash() {
        URL url = URL.parse("http://amazon.com/");
        assertEquals("http", url.getProtocol());
        assertEquals("amazon.com", url.getDomain());
        assertEquals("", url.getPath());
    }

    @Test
    public void testURLWithMultipleSlashes() {
        URL url = URL.parse("http://www.google.com/search/images");
        assertEquals("http", url.getProtocol());
        assertEquals("www.google.com", url.getDomain());
        assertEquals("search/images", url.getPath());
    }
}