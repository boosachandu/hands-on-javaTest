package com.java8;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

public class PhaserAsCyclicBarrier {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Phaser phaser = new Phaser(3);
        executorService.submit(new Task(phaser));
        executorService.submit(new Task(phaser));
        executorService.submit(new Task(phaser));

        Thread.sleep(2000);
    }

    public static class Task implements Runnable {
        private Phaser phaser;

        public Task(Phaser phaser) {
            this.phaser = phaser;
        }

        @SneakyThrows
        @Override
        public void run() {
            while (true) {
                phaser.arriveAndAwaitAdvance(); //Similar to barrier.await();
                //send message to corresponding system
            }
        }
    }
}
