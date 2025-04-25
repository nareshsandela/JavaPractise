package org.example;

import com.sun.source.tree.BreakTree;

public class SingletonDesignPattern {
    public static void main(String args[]) {
//        DBConnection connection = DBConnection.getInstance();
    }


    //Eager Initialisation Object is created during load time
    public static class DBConnectionEager {

        private static DBConnectionEager connection = new DBConnectionEager();

        private DBConnectionEager() {

        }

        private static DBConnectionEager getInstance() {
            return connection;
        }

    }


    //Lazy initialisation
    public static class DBConnectionLazy {
        private static DBConnectionLazy dbConnectionLazy;

        private DBConnectionLazy() {

        }

        private static DBConnectionLazy getInstance() {
            if (dbConnectionLazy == null) {
                dbConnectionLazy = new DBConnectionLazy();
            }
            return dbConnectionLazy;
        }
    }

    //using sychronized method only 1 thread can enter and return new object if null, but Locking everytime is expensive
    public static class DBConnectionSynchronized{
        private static DBConnectionSynchronized dbConnectionSynchronized;
        private DBConnectionSynchronized(){
        }
        synchronized DBConnectionSynchronized dbConnectionSynchronized(){
            if(dbConnectionSynchronized==null){
                dbConnectionSynchronized = new DBConnectionSynchronized();
            }
            return dbConnectionSynchronized;
        }
    }

    //Double checking
    public static class DBConnectionDoubleChecking{
        private static DBConnectionDoubleChecking dbConnectionDoubleChecking;
        private DBConnectionDoubleChecking(){

        }

        private static DBConnectionDoubleChecking dbConnectionDoubleChecking(){
            if(dbConnectionDoubleChecking==null){
                synchronized (DBConnectionDoubleChecking.class){
                    if (dbConnectionDoubleChecking==null){
                       dbConnectionDoubleChecking= new DBConnectionDoubleChecking();
                    }
                }
            }
            return dbConnectionDoubleChecking;
        }
    }
}
