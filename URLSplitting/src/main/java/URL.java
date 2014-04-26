/**
 * @author Sandro Dolidze
 */
public class URL {
    private final String protocol;
    private final String domain;
    private final String path;

    public static URL parse(String url) {
        if (url == null) {
            throw new IllegalArgumentException("input string must not be null");
        }

        String[] parts = url.split("://");

        return new URL(parts[0], null, null);
    }

    private URL(String protocol, String domain, String path) {
        this.protocol = protocol;
        this.domain   = domain;
        this.path     = path;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getDomain() {
        return domain;
    }

    public String getPath() {
        return path;
    }
}