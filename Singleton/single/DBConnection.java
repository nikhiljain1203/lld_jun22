package Singleton.single;

public class DBConnection {
    private static DBConnection instance = null;

    private DBConnection() {
        // intialise attributes
    }

    public static DBConnection getInstance() {
        if(instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
}
