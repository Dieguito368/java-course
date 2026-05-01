package org.bagon.patterns.singleton;

public class SingletonExample {
    public static void main(String[] args) {
        DatabaseConnectionSingleton connection = null;

        for (int i = 0; i <= 10; i++) {
            connection = DatabaseConnectionSingleton.getInstance();
            System.out.println(connection);
        }

        DatabaseConnectionSingleton connectio2 = DatabaseConnectionSingleton.getInstance();
        DatabaseConnectionSingleton connection3 = DatabaseConnectionSingleton.getInstance();

        System.out.println((connection == connectio2) && (connectio2 == connection3));
    }
}
