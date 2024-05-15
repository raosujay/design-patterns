package DesignPatterns.Singleton;

public class DBConnectionV7 {
    //Lazy Initialization - Final
    private static DBConnectionV7 dbc = null;
    private String url;
    private String username;
    private String password;
    private int port;

    public DBConnectionV7() {

    }
    public static DBConnectionV7 getInstance() {
        if(dbc == null) {
            // synchronized (dbc) --> this is also correct
            synchronized (DBConnectionV7.class) {
                if (dbc == null) {
                    dbc = new DBConnectionV7();
                }
            }
        }
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