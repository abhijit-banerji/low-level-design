package org.example;

public class DBConnectionEagerSingleton {
    private static DBConnectionEagerSingleton dbConnection = new DBConnectionEagerSingleton();
    private DBConnectionEagerSingleton(){
        System.out.println("Singleton using Eager Initialization");
    };

    public static DBConnectionEagerSingleton getInstance() {
        return dbConnection;
    }
}
