package DesignPatterns.Builder.Example2;

public class Main {
    public static void main(String[] args) {
        URLBuild build = new URLBuild();
            build.setProtocol("https");
            build.setDomain("example.com");
            build.setPort(8080);
            build.setPath("api/v1");
        String url = build.build();
        System.out.println("Constructed URL: " + url);
    }
}