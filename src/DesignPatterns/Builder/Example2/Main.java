package DesignPatterns.Builder.Example2;

public class Main {
    public static void main(String[] args) {
        URLBuild urlBuild = new URLBuild()
                .setProtocol("https")
                .setDomain("example.com")
                .setPort(8080)
                .setPath("api/v1");
        String url = urlBuild.build();
        System.out.println("Constructed URL: " + url);
    }
}