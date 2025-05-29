package org.example.String;

public class SingletonClass{
    //private static instance of same class
    private static SingletonClass instance;


    //private constructor to prevent initialization outside
    private SingletonClass(){
// Load config, DB connection, etc.

    }

//    Public static method to get the instance (thread-safe)
    public static synchronized SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass(); // lazy initialization
        }
        return instance;
    }


}