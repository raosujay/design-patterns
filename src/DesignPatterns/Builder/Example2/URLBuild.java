package DesignPatterns.Builder.Example2;

public class URLBuild {
    private String protocol;
    private String domain;
    private String path;
    private int port;

    public URLBuild() {}

    public URLBuild setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public URLBuild setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public URLBuild setPath(String path) {
        this.path = path;
        return this;
    }

    public URLBuild setPort(int port) {
        this.port = port;
        return this;
    }

    public String build() {
        return this.protocol + "://" + this.domain + ":" + this.port + "/" + this.path;
    }
}