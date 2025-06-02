package org.example;

public class DBConnectionLazySingleton {
    private static DBConnectionLazySingleton dbConnection;
    private DBConnectionLazySingleton(){
        System.out.println("Singleton using Lazy Initialization");
    };

    public static DBConnectionLazySingleton getInstance() {
        if(dbConnection == null) {
            dbConnection = new DBConnectionLazySingleton();
        }
        return dbConnection;
    }
}
