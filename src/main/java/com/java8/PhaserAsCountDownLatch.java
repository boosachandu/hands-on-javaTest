package com.java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

public class PhaserAsCountDownLatch {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Phaser phaser = new Phaser(3);
        executorService.submit(new DependentService(phaser));
        executorService.submit(new DependentService(phaser));
        executorService.submit(new DependentService(phaser));

        phaser.awaitAdvance(1); //similar to latch.await();

        System.out.println("All dependant service initialized");
        // program initialized, perform other operations
    }

    public static class DependentService implements Runnable {
        private Phaser phaser;

        public DependentService(Phaser phaser) {
            this.phaser = phaser;
        }

        @Override
        public void run() {
            //startup task
            phaser.arrive();     //similar to latch.countDown();
            //continue w/ other operations
        }
    }
}
