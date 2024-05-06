package DesignPatterns.Observer.Example2;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    public String news;
    private List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel) {
        channels.add(channel);
    }
    public void removeObserver(Channel channel) {
        channels.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for(Channel channel : channels) {
            channel.update(news);
        }
    }
}