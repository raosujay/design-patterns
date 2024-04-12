package DesignPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        DBConnectionV1 db1 = new DBConnectionV1();
        DBConnectionV1 db2 = new DBConnectionV1();

        // DBConnection V2
        // DBConnectionV2 db2 = new DBConnectionV2();
        // Error - DBConnectionV2()' has private access
        // in 'DesignPatterns.Singleton.DBConnectionV2

        DBConnectionV3 db3 = DBConnectionV3.getInstance();
        DBConnectionV3 db4 = DBConnectionV3.getInstance();

        //Non - threaded Singleton
        DBConnectionV4 db5 = DBConnectionV4.getInstance();
        DBConnectionV4 db6 = DBConnectionV4.getInstance();

        //Eager initialization
        DBConnectionV5 db7 = DBConnectionV5.getInstance();
        DBConnectionV5 db8 = DBConnectionV5.getInstance();

        //Using Synchronized Method
        DBConnectionV6 db9 = DBConnectionV6.getInstance();
        DBConnectionV6 db10 = DBConnectionV6.getInstance();

        //Using Synchronized Method - Double check locking
        DBConnectionV7 db11 = DBConnectionV7.getInstance();
        DBConnectionV7 db12 = DBConnectionV7.getInstance();

        System.out.println("hello");
    }
}
