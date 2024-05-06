package DesignPatterns.Observer.Example2;

public class NewsChannel implements Channel {
    private String news;

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public void update(String news) {
        this.setNews(news);
    }
}