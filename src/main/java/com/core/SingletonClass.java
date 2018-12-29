package com.core;

public class SingletonClass {
    //  eager initialization causes memory leaks
    //  eager initialization
    //private static volatile SingletonClass sSoleInstance = new SingletonClass();
    //volatile for fully initialized instance
    private static volatile SingletonClass sSoleInstance;

    //private constructor.
    // Suppresses default constructor, ensuring non-instantiability.
    private SingletonClass() {

        //Prevent form the reflection api.
        if (sSoleInstance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

   /* public static SingletonClass getInstance() {
        return sSoleInstance;
    }*/

/*    public static SingletonClass getInstance(){ //Lazy initialization
        if (sSoleInstance == null){ //if there is no instance available... create new one
            sSoleInstance = new SingletonClass();
        }

        return sSoleInstance;
    }*/

    public static SingletonClass getInstance() {
        //Double check locking pattern
        if (sSoleInstance == null) { //Check for the first time

            synchronized (SingletonClass.class) {   //Check for the second time.
                //if there is no instance available... create new one
                if (sSoleInstance == null) sSoleInstance = new SingletonClass();
            }
        }

        return sSoleInstance;
    }

    //Make singleton from serialize and deserialize operation.
    protected SingletonClass readResolve() {
        return getInstance();
    }
}
