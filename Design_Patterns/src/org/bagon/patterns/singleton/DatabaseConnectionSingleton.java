package org.bagon.patterns.singleton;

public class DatabaseConnectionSingleton {
    private static DatabaseConnectionSingleton connection;

    private DatabaseConnectionSingleton() {
        System.out.println("Connecting to the Database....");
    }

    public static DatabaseConnectionSingleton getInstance() {
        if(connection == null) {
            connection = new DatabaseConnectionSingleton();
        }   

        return connection;
    }
}