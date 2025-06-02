package org.example;

public class DBConnectionDoubleCheckSingleton {
    private static DBConnectionDoubleCheckSingleton dbConnection;
    private DBConnectionDoubleCheckSingleton(){
        System.out.println("Singleton using double check locking");
    };

    public static DBConnectionDoubleCheckSingleton getInstance() {
        if(dbConnection == null) {
            synchronized (DBConnectionDoubleCheckSingleton.class) {
                if(dbConnection == null) {
                    dbConnection = new DBConnectionDoubleCheckSingleton();
                }
            }
        }
        return dbConnection;
    }
}
