package Singleton.eager;

public class DBConnection {
    private static DBConnection instance
            = new DBConnection();

    private DBConnection() {
        // intialise attributes
    }

    public static DBConnection getInstance() {
        return instance;
    }
}
