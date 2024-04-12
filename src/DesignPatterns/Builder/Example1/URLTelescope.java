package DesignPatterns.Builder.Example1;
//this telescope constructor solves a lengthy code problem, but it won't provide a satisfactory solution for
//combinations of multiple constructor combinations
public class URLTelescope {
    private String protocol;
    private String hostname;
    private String port;
    private String partParam;
    private String quaryParam;

    public URLTelescope() {
    }
    public URLTelescope(String protocol) {
        this.protocol = protocol;
    }
    public URLTelescope(String protocol, String hostname) {
        this(protocol); //this constructor uses the already initialized constructor
        this.hostname = hostname;
    }
    public URLTelescope(String protocol, String hostname, String port) {
        this(protocol, hostname);
        this.port = port;
    }
    public URLTelescope(String protocol, String hostname, String port, String partParam) {
        this(protocol, hostname, port);
        this.partParam = partParam;
    }
    public URLTelescope(String protocol, String hostname, String port, String  partParam, String quaryParam) {
        this(protocol, hostname, port, partParam);
        this.quaryParam = quaryParam;
    }
}