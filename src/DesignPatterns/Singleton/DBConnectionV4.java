package DesignPatterns.Singleton;

public class DBConnectionV4 {
    private static DBConnectionV4 dbc = null;
    private String url;
    private String username;
    private String password;
    private int port;

    public DBConnectionV4() {

    }
    public static DBConnectionV4 getInstance() {
        if(dbc == null) {
            dbc = new DBConnectionV4();
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
