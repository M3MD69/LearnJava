package _1_learning._1_4_object_oriented_programming._1_4_14_singleton;

/* Singleton: is a design pattern rather than a feature specific to Java. A design pattern is like our code library that includes various coding techniques shared by programmers around the world. */

class Database {
    private static Database dbObject;

    private Database() {
        System.out.println("Done create database.");
    }

    static Database getInstance() {
        if (dbObject == null) dbObject = new Database();
        return dbObject;
    }

    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }
}

public class SingletonExample {
    public static void main(final String[] PARAMETERS) {
        Database db1;
        db1 = Database.getInstance();
        db1.getConnection();
    }
}