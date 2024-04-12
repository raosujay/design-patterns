package DesignPatterns.Builder.Example1;

public class URLBuilder {
    public static class Builder{
        private String protocol;
        private String hostname;
        private String port;
        private String pathParam;
        private String quaryParam;

        public URLBuilder build() {
            return new URLBuilder(this);
        }
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public Builder port(String port) {
            this.port = port;
            return this;
        }
        public Builder partParam(String partParam) {
            this.pathParam = partParam;
            return this;
        }
        public Builder quaryParam(String quaryParam) {
            this.quaryParam = quaryParam;
            return this;
        }
    }

    public final String protocol;
    public final String hostname;
    public final String port;
    public final String pathParam;
    public final String quaryParam;

    private URLBuilder(Builder builder) {
        this.protocol = builder.protocol;
        this.hostname = builder.hostname;
        this.port = builder.port;
        this.pathParam = builder.pathParam;
        this.quaryParam = builder.quaryParam;
    }
}