package org.example;

public class DBConnectionSynchronizedSingleton {
    private static DBConnectionSynchronizedSingleton dbConnection;
    private DBConnectionSynchronizedSingleton(){
        System.out.println("Singleton using synchronized");
    };

    synchronized public static DBConnectionSynchronizedSingleton getInstance() {
        if(dbConnection == null) {
            dbConnection = new DBConnectionSynchronizedSingleton();
        }
        return dbConnection;
    }
}
