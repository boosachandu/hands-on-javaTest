package com.core;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.logging.Logger;

public class SingletonTester {
    private static java.util.logging.Logger logger = Logger.getLogger(SingletonTester.class.getName());


    @Test
    public  void doubleCheckTest() {
        //Instance 1
        com.core.SingletonClass instance1 = SingletonClass.getInstance();

        //Instance 2
        SingletonClass instance2 = SingletonClass.getInstance();

        //now lets check the hash key.
        logger.info("Instance 1 hash:" + instance1.hashCode());
        logger.info("Instance 2 hash:" + instance2.hashCode());
        Assert.assertEquals("hash:", instance1.hashCode(),instance2.hashCode());
    }


    @Test(expected = Exception.class)
    public  void reflectionProofFailureTest() throws Exception {
        //Create the 1st instance
        SingletonClass instance1 = SingletonClass.getInstance();

        //Create 2nd instance using Java Reflection API.
        SingletonClass instance2 = null;
       // try {
            Class<SingletonClass> clazz = SingletonClass.class;
            Constructor<SingletonClass> cons = clazz.getDeclaredConstructor();
            cons.setAccessible(true);
            instance2 = cons.newInstance();
       /* } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException |
                InstantiationException e) {
           // e.printStackTrace();
        }*/

        //now lets check the hash key.
        logger.info("Instance 1 hash:" + instance1.hashCode());
        logger.info("Instance 2 hash:" + instance2.hashCode());
        Assert.assertEquals("hash:", instance1.hashCode(),instance2.hashCode());
    }

    @Test
    public  void  threadSafeTest() {
        //Thread 1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonClass instance1 = SingletonClass.getInstance();
                logger.info("Instance 1 hash:" + instance1.hashCode());
            }
        });

        //Thread 2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonClass instance2 = SingletonClass.getInstance();
                logger.info("Instance 2 hash:" + instance2.hashCode());
            }
        });

        //start both the threads
        t1.start();
        t2.start();

    }

    //For Singleton most of the time Serialization not required
    @Test
    public  void serializationTest() {
        try {
            SingletonClass instance1 = SingletonClass.getInstance();
            ObjectOutput out = null;

            out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
            out.writeObject(instance1);
            out.close();

            //deserialize from file to object
            ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
            SingletonClass instance2 = (SingletonClass) in.readObject();
            in.close();

            logger.info("instance1 hashCode=" + instance1.hashCode());
            logger.info("instance2 hashCode=" + instance2.hashCode());
            Assert.assertEquals("hash:", instance1.hashCode(),instance2.hashCode());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    //clone not required
    @Test
    public  void cloneableTest() {
        try {
            SingletonClass instance1 = SingletonClass.getInstance();

            SingletonClass instance2 = (SingletonClass)instance1.clone();


            logger.info("instance1 hashCode=" + instance1.hashCode());
            logger.info("instance2 hashCode=" + instance2.hashCode());
            Assert.assertEquals("hash:", instance1.hashCode(),instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
