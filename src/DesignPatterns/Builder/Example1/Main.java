package DesignPatterns.Builder.Example1;

public class Main {
    public static void main(String[] args) {
        URL url = new URL();
        url.setProtocol("https://");
        url.setHostname("mySite");
        url.setPort(":8080/");
        url.setPathParam("homePage");
        url.setQuaryParam("random");

//        System.out.print(url.getProtocol());
//        System.out.print(url.getHostname());
//        System.out.print(url.getPort());
//        System.out.print(url.getPartParam());

        //URL Builder
        URLBuilder.Builder builder = new URLBuilder.Builder();
        builder.protocol("https://").hostname("new-website:").port("443");
        // Elongated form
        // builder.protocol("https://");
        // builder.hostname("new-website");
        // builder.port("443");

        URLBuilder urlBuilder = builder.build();

        // Accessing fields via the urlBuilder instance
        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostname);
        System.out.print(urlBuilder.port);
    }
}