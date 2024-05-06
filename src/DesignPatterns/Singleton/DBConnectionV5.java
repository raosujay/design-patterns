package DesignPatterns.Singleton;

//Eager initialization - works for multithreading applications also
public class DBConnectionV5 {

    private static DBConnectionV5 dbc = new DBConnectionV5();
    private String url;
    private String username;
    private String password;
    private int port;

    private DBConnectionV5() {

    }
    public static DBConnectionV5 getInstance() {
        return dbc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
