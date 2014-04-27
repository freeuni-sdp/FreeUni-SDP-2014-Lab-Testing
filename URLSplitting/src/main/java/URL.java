/**
 * @author Sandro Dolidze
 */
public class URL {
    private final String protocol;
    private final String domain;
    private final String path;

    /**
     * assume that, if url is not null it is properly formatted
     */
    public static URL parse(String url) {
        if (url == null) {
            throw new IllegalArgumentException("input string must not be null");
        }

        String[] parts = url.split("://");

        String protocol = parts[0];
        String domain = parts[1];
        String path = "";

        int pos;
        if ((pos = domain.indexOf('/')) >= 0) {
            path = domain.substring(pos, domain.length());
            domain = domain.substring(0, pos);
        }

        return new URL(protocol, domain, path);
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