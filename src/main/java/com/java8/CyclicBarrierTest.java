package com.java8;

import lombok.SneakyThrows;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        CyclicBarrier barrier = new CyclicBarrier(3);
        executorService.submit(new Task(barrier));
        executorService.submit(new Task(barrier));
        executorService.submit(new Task(barrier));

        Thread.sleep(2000);
    }

    public static class Task implements Runnable {
        private CyclicBarrier barrier;

        public Task(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @SneakyThrows
        @Override
        public void run() {
            while(true) {
                barrier.await();
                //send message to corresponding system
            }
        }
    }
}
